import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class carresize extends Applet implements ActionListener{
Button b1=new Button("Maximize");
Button b2=new Button("Minimize");
int x=200,y=200,size=100;
public void init(){

add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
if(size>=100){
size=size+10;}
 
repaint();
}
if(e.getSource()==b2){
if(size>=110){
size=size-10;}
 
repaint();
}}
public void paint(Graphics g){

g.setColor(Color.BLUE);
g.fillRoundRect( x-65,y,size+100,(size/2),10,10);
g.setColor(Color.RED);
g.fillRoundRect(x-size,y+size/2,size*3,size,10,10);
g.setColor(Color.BLACK);
 g.fillOval(x-size/2-30,y+size,size-20,size-20);
 g.fillOval(x+ size,y+size ,size-20,size-20);
 g.setColor(Color.WHITE);
g.fillOval(x-size/2-30+15,y+size+17,size-50,size-50);
 g.fillOval(x+size+15,y+size+17 ,size-50,size-50);
 

}
}
/*<applet code="carresize.class" width=700 height=700>
</applet>*/
