import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {

  @Test
  public void cd_instantiatesCorrectly_true() {
    CD myCD = new CD("Tragic Kingdom");
    assertEquals(true, myCD instanceof CD);
  }

  @Test
  public void cd_instantiatesWithTitle_true() {
    CD myCD = new CD("Tragic Kingdom");
    assertEquals("Tragic Kingdom", myCD.getTitle());
  }
}
