import java.util.ArrayList;

import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.fluentlenium.core.filter.FilterConstructor.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
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
    assertThat(pageSource()).contains("*~mY cDz~*");
  }

  @Test
  public void CDIsCreatedTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a new CD"));
    fill("#title").with("Tragic Kingdom");
    submit(".btn");
    assertThat(pageSource()).contains("Your CD has been saved.");
  }
}
