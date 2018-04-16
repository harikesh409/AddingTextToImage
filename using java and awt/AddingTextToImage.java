import java.awt.Color;
import java.awt.Font; 
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
 
public class AddingTextToImage
{
    public static void main(String[] args)
    {
        BufferedImage img = null;
        File f = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String source;
        String text="test";
        int x=100,y=100;
        try
        {
            System.out.println("Enter complete source path including the image extension");
            source = br.readLine();
            System.out.println("Enter text");
            text = br.readLine();
            System.out.println("Enter x co-ordinate");
            x = Integer.parseInt(br.readLine());
            System.out.println("Enter y co-ordinate");
            y = Integer.parseInt(br.readLine());
            f = new File(source);
            img = ImageIO.read(f);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        BufferedImage temp = new BufferedImage(img.getWidth(),img.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics graphics = temp.getGraphics();
        graphics.drawImage(img, 0, 0, null);
        graphics.setFont(new Font("Arial", Font.BOLD, 80));
        graphics.setColor(new Color(255, 0, 0));
        graphics.drawString(text,x,y);
        graphics.dispose(); 
        f = new File("output.png");
        try
        {
            ImageIO.write(temp, "png", f);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}