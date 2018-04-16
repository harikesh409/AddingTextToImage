import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class AddingTextToImage {
   public static void main(String args[]) {

      //Loading the OpenCV core library
      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
      String source = null;
      String text = "test";
      String destination = "op.jpg";
      int x=100,y=100;
      try {
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	  System.out.println("Enter source path including name and extension");
    	  source = br.readLine();
    	  System.out.println("Enter the text");
    	  text = br.readLine();
    	  System.out.println("Enter the x co-ordinate");
    	  x = Integer.parseInt(br.readLine());
    	  System.out.println("Enter the y co-ordinate");
    	  y = Integer.parseInt(br.readLine());
    	  System.out.println("Enter destination path including name and extension");
    	  destination = br.readLine();
      } catch(Exception e) {
    	  System.out.println(e);
      }
      // Reading the Image from the file and storing it in to a Matrix object
      Mat matrix = Imgcodecs.imread(source);

      //Adding Text
      Imgproc.putText(matrix,        //Matrix obj of the image
         text,           //Text to be added
         new Point(x,y),        //point
         Core.FONT_HERSHEY_SIMPLEX , //front face
         1,                          //front scale
         new Scalar(0, 0, 0),        //Scalar object for color
         5);                         //Thickness

      Imgcodecs.imwrite(destination, matrix);
      System.out.println("Image Processed");
   }
} 