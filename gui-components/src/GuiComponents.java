import javax.swing.*;
public class GuiComponents{
    public static void main() {

        //1. Create JFrame
        JFrame jFrame = new JFrame("GUI components");
        //2. Set Default Size
        jFrame.setSize(800,900);
        //3. Close Operation
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set Layout
        jFrame.setLayout(null);

        JButton firstButton = new JButton("First Button");
        JButton secondButton = new JButton("Second Button");
        JButton thirdButton = new JButton("Third Button");
        firstButton.setBounds(100,200,150,80);
        secondButton.setBounds(100,281,150,80);
        thirdButton.setBounds(100,362,150,80);
        jFrame.add(firstButton);
        jFrame.add(secondButton);
        jFrame.add(thirdButton);
        //Set Visibility
        jFrame.setVisible(true);
        //ToDo Jlabel JTextArea JPasswordField //JTextField //JSlider
    }
}
