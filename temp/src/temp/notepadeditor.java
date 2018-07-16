package temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java .io.*;
import java.util.*;
class notepadeditor extends JFrame implements MouseListener,ActionListener
{ JFrame jf,jf1;
   JLabel jl=new JLabel("This EDITOR is work of Manisha Production, All Rights Reserved"); 
    JTextField jtf;
   JTextArea jta,jta1;
int temp =0;
File f;

  JScrollPane jsp,jsp1;
  JMenuBar mb;    
  JMenu file,edit,help,run;    
  JMenuItem open,cut,copy,paste,selectAll,jbrun,jbcompile,save,about; 
  Runtime r;
  String str="";
String str1="";
  String fname="";
  String result="";
  String result1="";

  notepadeditor()
 { jf =new JFrame("editor");
   jf.setLayout(null);
   cut=new JMenuItem("cut");    
   copy=new JMenuItem("copy");    
   paste=new JMenuItem("paste");    
   selectAll=new JMenuItem("selectAll");  
   jbrun=new JMenuItem("run");
   jbcompile= new JMenuItem("compile");
   save= new JMenuItem("save");
       open= new JMenuItem("OPEN");
       about=new JMenuItem("ABOUT");
        
    open.addActionListener(this); 
    cut.addActionListener(this);    
    copy.addActionListener(this);    
   paste.addActionListener(this);    
   selectAll.addActionListener(this);
    save.addActionListener(this); 
    about.addActionListener(this);

   jbrun.addActionListener(this);   
   jbcompile.addActionListener(this);   
   mb=new JMenuBar();    
   file=new JMenu("File");    
   edit=new JMenu("Edit");    
   help=new JMenu("Help");  
   run= new JMenu("Run");  
   
 
   edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);   
   help.add(about);
   file.add(save);file.add(open);
   mb.add(file);mb.add(edit);
mb.add(help);//mb.add(run);    

   jf.add(mb);    
   jf.setJMenuBar(mb);  

   //jl=new JLabel("enter java class name");
   
   jtf=new JTextField();
   jtf.setBounds(180,20,230,25);
   jta=new JTextArea(100,100);
   jta.addMouseListener(this); 
   //jta.addFocusListener(new MyFocusListener(this));
   //jta.addActionListener(this);
   jta1=new JTextArea(100,100);
   jta.setFont(new Font ("varinda",Font.PLAIN,15));
   jta1.setFont(new Font ("varinda", Font.PLAIN,15));
   jsp=new JScrollPane(jta);
   jsp1=new JScrollPane(jta1);
   jsp.setBounds(10,10,1030,520);
   jsp1.setBounds(450,60,400,350);
   jf.add(jsp);
   //jf.add(jsp1);

   //jf.add(jl);
   //jf.add(jtf);
   r=Runtime.getRuntime();

   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   jf.setSize(1050,550);
   jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{ 
   

 
  

 if(e.getSource()==save)
{ savefile();}


else if(e.getSource()==open)
{openFile();}

else if(e.getSource()==paste)
{
jta.replaceSelection(str1);
}
else if(e.getSource()==cut)
{jta.replaceSelection("");}
else if(e.getSource()==about)
{jf1=new JFrame("help");
//jf1.setLayout(null);
//jl.setBounds(20,20,1000,205);
jf1.add(jl);
jf1.setSize(1030,300);
jf1.setVisible(true);
}


}
public void mouseReleased(MouseEvent e)
{if( jta.getSelectedText()!=null)
  str1=jta.getSelectedText();
System.out.println(str1);
}
public void mouseEntered(MouseEvent e)
{
}
public void mouseClicked(MouseEvent e)
{
}
public void mouseExited(MouseEvent e)
{
}
public void mousePressed(MouseEvent e)
{
}


void openFile()
{  
  JFileChooser fc=new JFileChooser();  
   int i=fc.showOpenDialog(this);  
          
  if(i==JFileChooser.APPROVE_OPTION)
  {  try
{
     f=fc.getSelectedFile();  
    String filepath=f.getPath();  
 System.out.println(filepath);
//Process p=r.exec("cd "+filepath);

    jtf.setText(fc.getSelectedFile().getName());

              
    displayContent(filepath); temp=1;
jf.setTitle(fc.getSelectedFile().getName()); }
catch(Exception e)
{e.printStackTrace();}
              
  } 
 
}


void displayContent(String fpath)
{  
  try
{  
  BufferedReader br=new BufferedReader(new FileReader(fpath));  
  String s1="",s2="";  
              
  while((s1=br.readLine())!=null){  
  s2+=s1+"\n";  
  }  
  jta.setText(s2);  
  br.close();  
}catch (Exception e) {e.printStackTrace();  }  
}  



void savefile()
{if(temp==1)
{
 

   
try
   {
           FileWriter fw=new FileWriter(f.getAbsolutePath());
               
           String s1= jta.getText();
           PrintWriter pw=new PrintWriter(fw);
           pw.println(s1);
           pw.flush();}
   catch(Exception e3)
  { System.out.println(e3);}
} 
 
else
{

 
JFileChooser fileChooser = new JFileChooser();
fileChooser.setDialogTitle("Specify a file to save");   
 
int userSelection = fileChooser.showSaveDialog(this);
 
if (userSelection == JFileChooser.APPROVE_OPTION) 
{
    File fileToSave = fileChooser.getSelectedFile();
    
try
   {
           FileWriter fw=new FileWriter(fileToSave.getAbsolutePath());
               
           String s1= jta.getText();
           PrintWriter pw=new PrintWriter(fw);
           pw.println(s1);
           pw.flush();}
   catch(Exception e3)
  { System.out.println(e3);}
} 
}
}
public static void main(String args[])
{new notepadeditor();
}


}
