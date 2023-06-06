/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
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
public class exitButton extends JLabel{
     
    private int size = 20;
    public exitButton() throws IOException{
        super("");
        URL iconURL = getClass().getResource("/images/exit.png");
//        File file = new File("/images/logo.png");
        BufferedImage image = ImageIO.read(iconURL);

        Image newImage = image.getScaledInstance(size, size, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImage);
        setBackground(new Color(0,0,0,0));
        setText("");        setIcon(icon);
        setHorizontalAlignment(CENTER);
        setSize(getWidth(),getHeight());
        setBorder(new EmptyBorder(8, 5, 8, 5));
        addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked!");
        System.exit(0);
    }
});
        }
}
