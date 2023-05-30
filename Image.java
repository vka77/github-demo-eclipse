package thuchanh23;

public class Image {
	// represent information about an image
	   int width; // in pixels
	   int height; // in pixels
	   String source; // nguon` cua anh
	   String quality; // chat luong
	   Image(int width, int height, 
	                String source, String quality) {
	      this.width = width;
	      this.height = height;
	      this.source = source;
	      this.quality = quality;

	   	}
	   /* isPortrait: co phai la chan dung hay k
	    * example:
	    * witdh:1080
	    * height: 1920
	    * output: true
	    */
	   
	   boolean isPortrait() {
		return this.width <this.height;
		   
	   }
	   /* kich thuoc cua anh? (pixel)
	    * example
	    * height: 1080
	    * width: 1902
	    * output: 1920*1080= 2073600
	    */
	   int size() {
		   return this.width*this.height;
		   
	   }
	   /* so sanh anh? nao lon hon
	    * example: 
	    * Image1.size > Image2.size=> return true
	    * 
	    */
	   boolean isLarger () {
		   return size()>size();
		   
	   }
	   /* same: xem anh? nay co giong anh? kia ko
	    * example:
	    * this.source = that.source
	    * output: true
	    * 
	    */

   		boolean same( String source1) {
   			if (this.source == source1)
   				return true;
   			else 
   				return false;
   			
   		}
   		/* kich thuoc anh? (to nho?)
   		 * example:
   		 * size <=10000 => small */
   		String sizeString () {
   			if (size()<=10000 && size()>0)
   				return "Small";
   			else if (size()>10000 && size() <=1000000)
   				return "Medium";
   			else 
   				return "Large";
			
   			
   			
   		}			
   	}
   		 
   	


