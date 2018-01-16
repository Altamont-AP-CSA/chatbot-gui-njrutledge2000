import javax.swing.*;
import java.awt.*;
public class GLaDBot{
    public static void main (String[] args){
        JLabel label = new JLabel("Welcome to the Aperture GLaDChat initiative. I am GLaDOS, you're forced host.");
        label.setFont(new Font ("Bookman Old Style", Font.PLAIN, 30));
        JOptionPane.showMessageDialog(null, label, "Intiating Aperture GladChat v 2.5.1", JOptionPane.INFORMATION_MESSAGE);
        label.setText("What is your name test subject " + (int)(Math.random()*100000) + "?");
        String name = JOptionPane.showInputDialog(label);
        if(!name.equals("exit")){
            label.setText("Nice to meet you, " + name + ".");
            JOptionPane.showMessageDialog(null, label, "Greetings", JOptionPane.INFORMATION_MESSAGE);
            label.setText("What do you like to do?");
            String answer = JOptionPane.showInputDialog(label);
            answer.toLowerCase();
            int num = 0;
            while(!answer.equals("exit")){
                if(answer.indexOf("sports")!=-1){
                    label.setText("Sports...gross...My programing requires me to ask \"what is your favorite sport?\"  Wow that one hurt to ask. Thanks " + name + ".");
                    answer = JOptionPane.showInputDialog(label);
                    if(!answer.equals("exit")){
                        label.setText("Wow...such a lame sport. I mean you didn't even pick one of the good ones.");
                        JOptionPane.showMessageDialog(null, label, "wow", JOptionPane.INFORMATION_MESSAGE);
                    }
                }else if(answer.indexOf("videogames")!=-1 || answer.indexOf("video games")!=-1){
                    label.setText("Ah, videogames. A fine choice. Do you have a favorite?");
                    answer = JOptionPane.showInputDialog(label);
                    if(!answer.equals("exit")){
                        if(answer.toLowerCase().indexOf("portal")!=-1){
                            label.setText("Portal, what a lovely game, one of my favorites, especially as it has me in it.");
                        }else{
                            label.setText("I have heard that the game " + answer + " is nice.");
                        }
                        JOptionPane.showMessageDialog(null, label, "gaming", JOptionPane.INFORMATION_MESSAGE);
                    }
                }else if(answer.indexOf("chell")!=-1){
                    label.setText("CHELL IS A MURDERER");
                    label.setFont(new Font("Bookman Old Style", Font.BOLD, 60));
                    JOptionPane.showMessageDialog(null, label, "wow", JOptionPane.INFORMATION_MESSAGE);
                    label.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
                }else if(answer.indexOf("testing")!=-1 || answer.indexOf("test")!=-1){
                    label.setText("Oh my, I love testing, I love watching you humans try to succeed, and then fail. again and again. forever.");
                    JOptionPane.showMessageDialog(null, label, "testing", JOptionPane.INFORMATION_MESSAGE);
                }else if(answer.indexOf("secret_code")!=-1){
                    label.setText("try answering chell, sports, testing, or videogames.");
                    label.setFont(new Font("Comic Sans", Font.BOLD, 50));
                    JOptionPane.showMessageDialog(null, label, "secret!", JOptionPane.INFORMATION_MESSAGE);
                    label.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
                }else {
                    num = (int)(Math.random()*4);
                    if(num==0){label.setText("Oh, how interesting.");}
                    else if(num==1){label.setText("hmm, sounds fun.");}
                    else if(num==2){label.setText("cool.");}
                    else if(num==3){label.setText("that one is...different, to say the least.");}
                    JOptionPane.showMessageDialog(null, label, "cool story, " + name, JOptionPane.INFORMATION_MESSAGE);
                }
                if(!answer.equals("exit")){
                    label.setText("What else do you like to do?");
                    answer = JOptionPane.showInputDialog(label);
                    answer.toLowerCase();
                }
            }  
        }
        label.setText("Goodbye, " + name + ". Don't come back.");
        JOptionPane.showMessageDialog(null, label, "Now I only want you gone", JOptionPane.INFORMATION_MESSAGE);
    }
}