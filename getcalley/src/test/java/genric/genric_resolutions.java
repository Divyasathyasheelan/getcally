package genric;

import org.openqa.selenium.Dimension;

public class genric_resolutions extends BASE_CLASS{

	public static Dimension resolutions(int width,int ht) {
	
		org.openqa.selenium.Dimension dim = new org.openqa.selenium.Dimension(width, ht);
		return dim;
		
		
		
		
	}
	
}
