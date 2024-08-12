// package p1;

// from guru99 5 days live project java

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ExpertsCodeOnlineTest extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton[] option =new JRadioButton[5];
    JButton b1,b2;
    ButtonGroup bg;
    int count=0,current=0,x=1,y=1,now=0;
    int[] m =new int[10];
    ExpertsCodeOnlineTest()
    {
        label=new JLabel();
        add(label);
        bg=new ButtonGroup();
        for(int i=0;i<5;i++)
        {
            option[i]=new JRadioButton();
            add(option[i]);
            bg.add(option[i]);
        }
        b1=new JButton("Next");
        b1.addActionListener(this);
        add(b1);
        set();
        label.setBounds(30,40,450,20);
        option[0].setBounds(50,80,100,20);
        option[1].setBounds(50,110,100,20);
        option[2].setBounds(50,140,100,20);
        option[3].setBounds(50,170,100,20);
        b1.setBounds(100,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {

            count=count+1;
            current++;
            set();
        }
    }



    void set()
    {

        if(current==0)
        {
            label.setText("Que1: Which one among these is not a datatype");
            option[0].setText("int");option[1].setText("Float");option[2].setText("boolean");option[3].setText("char");
        }
        if(current==1)
        {
            label.setText("Que2: Which class is available to all the class automatically");
            option[0].setText("Swing");option[1].setText("Applet");option[2].setText("Object");option[3].setText("ActionEvent");
        }
        if(current==2)
        {
            label.setText("Que3: Which package is directly available to our class without importing it");
            option[0].setText("swing");option[1].setText("applet");option[2].setText("net");option[3].setText("lang");
        }
        if(current==3)
        {
            label.setText("Que4: String class is defined in which package");
            option[0].setText("lang");option[1].setText("Swing");option[2].setText("Applet");option[3].setText("awt");
        }
        if(current==4)
        {
            label.setText("Que5: Which institute is best for java coaching");
            option[0].setText("Guru99");option[1].setText("ABC");option[2].setText("XYZ");option[3].setText("123");
        }
        if(current==5)
        {
            label.setText("Que6: Which one among these is not a keyword");
            option[0].setText("class");option[1].setText("int");option[2].setText("get");option[3].setText("if");
        }
        if(current==6)
        {
            label.setText("Que7: Which one among these is not a class ");
            option[0].setText("Swing");option[1].setText("ActionPerformed");option[2].setText("ActionEvent");option[3].setText("Button");
        }
        if(current==7)
        {
            label.setText("Que8: which one among these is not a function of Object class");
            option[0].setText("toString");option[1].setText("finalize");option[2].setText("equals");option[3].setText("getDocumentBase");
        }
        if(current==8)
        {
            label.setText("Que9: which function is not present in Applet class");
            option[0].setText("init");option[1].setText("main");option[2].setText("start");option[3].setText("destroy");
        }
        if(current==9)
        {
            label.setText("Que10: Which one among these is not a valid component");
            option[0].setText("JButton");option[1].setText("JList");option[2].setText("JButtonGroup");option[3].setText("JTextArea");
        }
        label.setBounds(30,40,450,20);
        for(int i=0,j=0;i<=90;i+=30,j++)
            option[j].setBounds(50,80+i,200,20);
    }
    public static void main(String[] s)
    {

        new ExpertsCodeOnlineTest();
    }
}