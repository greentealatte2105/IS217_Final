
package component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author dothinhtpr247gmai.com
 */
public class logo extends JLabel{
     
    public logo(){
        setText("");
    }
    @Override
    protected void paintComponent(Graphics g) {
        ImageIcon imgIcon = new ImageIcon("/Users/dothinhtpr247gmai.com/NetBeansProjects/IS217_Final/IS217_Final/ProjectCafe/app/src/main/java/images/logo.png");
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(((ImageIcon) imgIcon).getImage(), 0, 0, getWidth(), getWidth(), null);
        g2d.dispose();
        super.paintComponent(g);
    }
//    
}
