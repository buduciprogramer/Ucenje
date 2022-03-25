package hrana;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class MainResize {

    public static void main(String[] args) {


File jpgOriginal=new File("C:\\Users\\PC\\Desktop\\hamburger.jpg");
File jpgResized=new File("C:\\Users\\PC\\Desktop\\resized.jpg");
    resizeImage(jpgOriginal,jpgResized,200,200,"jpg");

    }

    private static void resizeImage(File originalImage, File resizedImage, int width, int height, String format) {
        try {
BufferedImage original= ImageIO.read(originalImage);
        BufferedImage resized=new BufferedImage(width,height,original.getType());
        Graphics2D graphics2D=resized.createGraphics();
        graphics2D.drawImage(original,0,0,width,height,null);
        graphics2D.dispose();
        ImageIO.write(resized,format,resizedImage);
        } catch (IOException exception) {
         exception.printStackTrace();
        }
    }
}