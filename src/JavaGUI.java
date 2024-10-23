
import javax.swing.JFrame; //* itu import semua
import javax.swing.JLabel;

public class JavaGUI {
    public static void main(String[] args) {
        //menginstalasi objek frame
        JFrame frame = new JFrame("Aplikasi GUI Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(300, 200);
        
        JLabel label = new JLabel("Ini adalah label");
        
        frame.add(label);
        
        frame.setVisible(true);
        
       
    }
}
