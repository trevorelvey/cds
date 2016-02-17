import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {

  @Test
  public void cd_instantiatesCorrectly_true() {
    CD myCD = new CD("Tragic Kingdom");
    assertEquals(true, myCD instanceof CD);
  }
}
