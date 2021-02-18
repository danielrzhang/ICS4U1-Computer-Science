/**
 * Piano.java
 * represents a piano instrument that inherits from StringInstrument.
 * @author Daniel Zhang
 * @since October 20, 2020
 * @version 1.0
 */
public class Piano extends StringInstrument {
  
  /**
   * Piano
   * - sets the instrument name to "Piano" when a Piano object is created.
   */
  Piano() {
    setInstrumentName("Piano");
  }
  
  /**
   * play
   * - prints out the sound of the Piano when played.
   */
  @Override
  public void play() {
    System.out.println("Plink plink plonk");
  }
}