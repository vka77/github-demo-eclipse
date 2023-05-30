package thuchanh23;

import junit.framework.TestCase;

public class DataImageTest extends TestCase{
	public void testConstructor () {
		new Image(200, 400, "abc.xyz", "good");
		new Image(300, 500, "fad.dac", "ok");
		
	}
	//thu xem co phai la anh? chan dung hay k
	public void testIsPortrait() {
		Image aImage1 = new Image(200, 300, "fad.dac", "ok");
		Image aImage2 = new Image(400, 300, "asd.com","bad");
		assertTrue(aImage1.isPortrait());
		assertFalse(aImage2.isPortrait());
		
	}
//	//tinh so pixel cua buc anh
	public void testSize() {
		Image aImage1 = new Image(200, 300, "fad.dac", "ok");
		Image aImage2 = new Image(400, 300, "asd.com","bad");
		assertEquals (aImage1.size(),60000);
		assertEquals (aImage2.size(),120000);
	}
	//xem anh? co giong anh kia k
	public void testSame() {
		Image aImage1 = new Image(200, 300, "fad.dac", "ok");
		Image aImage2 = new Image(400, 300, "asd.com","bad");
		assertTrue(aImage1.same("fad.dac"));
		assertFalse(aImage2.same("dasdas"));
	}
	//so sanh buc nao to hon
	public void testisLarger() {
		Image aImage1 = new Image(200, 300, "fad.dac", "ok");
		Image aImage2 = new Image(400, 300, "asd.com","bad");
		assertFalse(aImage1.size() > aImage2.size());
						
	}
	//kich thuoc cua anh? (to nho?)
	public void testSizeString() {
		Image aImage1 = new Image(200, 300, "fad.dac", "ok");
		Image aImage2 = new Image(400, 300, "asd.com","bad");
		assertEquals(aImage1.sizeString(), "Medium");
		assertEquals(aImage2.sizeString(), "Medium");
	}
}
