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

  @Test
  public void all_returnsAllIntancesOfCD_true() {
    CD firstCD = new CD("Tragic Kingdom");
    CD secondCD = new CD("Is The Is Are");
    assertTrue(CD.all().contains(firstCD));
    assertTrue(CD.all().contains(secondCD));
  }

  @Test
  public void newID_CDInstantiatesWithAnID_true() {
    CD myCD = new CD("Tragic Kingdom");
    assertEquals(CD.all().size(), myCD.getID());
  }
}
