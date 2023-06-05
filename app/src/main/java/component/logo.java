
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

    }
    @Override
    protected void paintComponent(Graphics grphcs)
    {
        ImageIcon imgIcon = new ImageIcon("/Users/dothinhtpr247gmai.com/NetBeansProjects/IS217_Final/IS217_Final/ProjectCafe/app/src/main/java/images/logo.png");
        BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(((ImageIcon) imgIcon).getImage(), 0,0, getWidth(), getHeight(), null);
        g2.dispose();
        super.paintComponent(grphcs);
    }
//    
}
