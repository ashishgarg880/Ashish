import java.awt.*;
import java.applet.*;
import java.util.*;

public class start extends Applet
{
	public void init ()
	 {
	 	Color parseColor;
   String squareSizeParam = getParameter("squareSize");
   parseSquareSize(squareSizeParam);
   
   String colorParam = getParameter("color");
   Color fg = parseColor(colorParam);
   
   setBackground (Color.black);
   setForeground (fg);
}

private void parseSquareSize (String param) {
   if (param == null) return;
   try {
      squareSize = Integer.parseInt (param);
   } catch (Exception e) {
      // Let default value remain
   }
}

}