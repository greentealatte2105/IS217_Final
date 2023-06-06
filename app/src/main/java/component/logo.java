
package component;
import IS217_Final.Dashboard;
import IS217_Final.Login;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author dothinhtpr247gmai.com
 */
public class logo extends JLabel{
     
    private int size = 50;
    public logo() throws IOException{
        super("");
        URL iconURL = getClass().getResource("/images/logo.png");
//        File file = new File("/images/logo.png");
        BufferedImage image = ImageIO.read(iconURL);
        Image newImage = image.getScaledInstance(size, size, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImage);
        setBackground(new Color(0,0,0,0));
        setText("");        setIcon(icon);
        
        setSize(getWidth(),getHeight());
        setBorder(new EmptyBorder(8, 5, 8, 5));
        }
    
//    
}
