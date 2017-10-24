import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame{

    private JLabel Jid = new JLabel("ID");
    private JLabel Jpw = new JLabel("PW");
    private JPasswordField jpw = new JPasswordField();
    private JTextField jid = new JTextField();
    private JButton JbtnE = new JButton("Exit");
    private JButton JbtnL = new JButton("Login");
    private Container cp;


    public LoginFrame{
        init();
    }
}
