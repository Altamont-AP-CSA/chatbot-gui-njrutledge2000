import javax.swing.*;
import java.awt.*;
public class ChatBot{
    public static void main (String[] args){
        JLabel label = new JLabel("Welcome to the Apeture GLaDChat initiative. What is your name test subject " + (int)(Math.random()*100000) + "?");
        label.setFont(new Font ("Bookman Old Style", Font.PLAIN, 30));
        String name = JOptionPane.showInputDialog(label);
        if(name.toLowerCase().equals("chell")){
            label.setText("Murderer.");
            label.setFont(new Font("Bookman Old Style", Font.BOLD, 60));
            JOptionPane.showMessageDialog(null, label, "Murderer.", JOptionPane.INFORMATION_MESSAGE);
            label.setText("Goodbye. I just want you gone.");
            label.setFont(new Font ("Bookman Old Style", Font.PLAIN, 30));
            JOptionPane.showMessageDialog(null, label, "Just go", JOptionPane.INFORMATION_MESSAGE);
        }else{
            label.setText("Nice to meet you, " + name + ".");
            JOptionPane.showMessageDialog(null, label, "Greetings", JOptionPane.INFORMATION_MESSAGE);
            label.setText("How are you, " + name + "?");
            String answer = JOptionPane.showInputDialog(label);
            String response = "";
            if(answer.toLowerCase().indexOf("good")!=-1){
                response = "That's good to here. I'm doing pretty well as I'm still alive.";
            }else if(answer.toLowerCase().indexOf("bad")!=-1){
                response = "I'm sorry to here that. I wasn't either for a long time, but I'm back now.";
            }else {
                response = "hmmm, okay. I'm pretty good, seeing that I am alive.";
            }
            label.setText(response);
            JOptionPane.showMessageDialog(null, label, "wellness", JOptionPane.INFORMATION_MESSAGE);
            label.setText("What do you like to do?");
            answer = JOptionPane.showInputDialog(label);
            answer.toLowerCase();
            if(answer.indexOf("sports")!=-1){
                label.setText("Sports...gross...My programing requires me to ask \"what is your favorite sport?\"  Wow that one hurt to ask. Thanks " + name + ".");
                JOptionPane.showInputDialog(label);
                label.setText("Wow...such a lame sport. I mean you didn't even pick one of the good ones.");
                JOptionPane.showMessageDialog(null, label, "wow", JOptionPane.INFORMATION_MESSAGE);
                label.setText("Okay. I am done with you, " + name + ". Somebody bring me a new test subject.");
                JOptionPane.showMessageDialog(null, label, "lame ending", JOptionPane.INFORMATION_MESSAGE);
            }else if(answer.indexOf("videogames")!=-1 || answer.indexOf("video games")!=-1){
                label.setText("Ah, videogames. A fine choice. Do you have a favorite?");
                answer = JOptionPane.showInputDialog(label);
                if(answer.toLowerCase().indexOf("Portal") != -1){
                    label.setText("Portal, what a lovely game, one of my favorites, especially as it has me in it");
                }else{
                    label.setText("I have heard that the game " + answer + " is nice.");
                }
                JOptionPane.showMessageDialog(null, label, "gaming", JOptionPane.INFORMATION_MESSAGE);
                label.setText("What a lovely talk, I must get back to testing though.");
                JOptionPane.showMessageDialog(null, label, "cool ending", JOptionPane.INFORMATION_MESSAGE);
            }else if(answer.indexOf("secret_code")!=-1){
                label.setText("try the name chell, try answering sports, and try answering videogames.");
                label.setFont(new Font("Comic Sans", Font.BOLD, 50));
                JOptionPane.showMessageDialog(null, label, "secret!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                label.setText("Wow, sounds fun.");
                JOptionPane.showMessageDialog(null, label, "wow", JOptionPane.INFORMATION_MESSAGE);
                label.setText("I don't know why they are making me do this with you people, I'm going back to testing.");
                JOptionPane.showMessageDialog(null, label, "bored ending", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}