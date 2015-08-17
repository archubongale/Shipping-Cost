import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  //FluentTest used with integration tests

      public WebDriver webDriver = new HtmlUnitDriver();

      @Override
      public WebDriver getDefaultDriver() {
      return webDriver;
      }
      @ClassRule
      public static ServerRule server = new ServerRule();

      @Test
      public void rootTest() {
        goTo("http://localhost:4567/");
        assertThat(pageSource()).contains("Triangle Type");
      }

      @Test
      public void triangleTestIsATriangle() {
      goTo("http://localhost:4567/");
      fill("#side1").with("3");
      fill("#side2").with("4");
      fill("#side3").with("5");
      submit(".btn");
      assertThat(pageSource()).contains("Your dimensions make a triangle!");
      }

      @Test public void triangleTestIsNotATriangle() {
      goTo("http://localhost:4567/");
      fill("#side1").with("1");
      fill("#side2").with("1");
      fill("#side3").with("10");
      submit(".btn");
      assertThat(pageSource()).contains("Your dimensions are not a triangle.");
      }
    }
