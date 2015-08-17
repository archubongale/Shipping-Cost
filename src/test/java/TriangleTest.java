import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
    //unit tests

		@Test
		public void newTriangle_isTriangleside1(){
			Triangle testTriangle = new Triangle(2,2,2);
			assertEquals(2, testTriangle.getSide1());
		}

		@Test
		public void newTriangle_isTriangleside2() {
	   Triangle testTriangle = new Triangle(2, 3, 4);
	   assertEquals(3, testTriangle.getSide2());
		}

		@Test
		public void isTriangle_whenATriangle_true() {
			Triangle testTriangle = new Triangle(2, 3, 4);
			assertEquals(true, testTriangle.isTriangle());
		}

		@Test
		public void isTriangle_whenNotATriangle_false() {
			Triangle testTriangle = new Triangle(0, 1, 3);
			assertEquals(false, testTriangle.isTriangle());
		}
}
