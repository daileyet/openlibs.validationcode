/**
 * 
 */
package com.openthinks.libs.check;

import org.junit.Assert;
import org.junit.Test;

import com.openthinks.libs.check.impl.CharacterValidata;
import com.openthinks.libs.check.impl.LetterValidata;
import com.openthinks.libs.check.impl.NumberValidata;

/**
 * @author dailey
 *
 */
public class CkeckTest {

  @Test
  public void testNumberValidata() {
    Validata validata = new NumberValidata(4);
    String generateCode1 = validata.create();
    Assert.assertTrue(generateCode1.length() == 4);
    System.out.println(generateCode1);
    try {
      Integer.valueOf(generateCode1);
    } catch (NumberFormatException e) {
      Assert.fail();
      return;
    }

    String generateCode2 = validata.create();
    Assert.assertEquals(generateCode2, validata.getLastCheck());
  }

  @Test
  public void testLetterValidata() {
    Validata validata = new LetterValidata(4);
    String generateCode1 = validata.create();
    Assert.assertTrue(generateCode1.length() == 4);
    System.out.println(generateCode1);
    try {
      Integer.valueOf(generateCode1);
      Assert.fail();
      return;
    } catch (NumberFormatException e) {

    }
    String generateCode2 = validata.create();
    Assert.assertEquals(generateCode2, validata.getLastCheck());
  }

  @Test
  public void testCharacterValidata() {
    Validata validata = new CharacterValidata(4);
    String generateCode1 = validata.create();
    Assert.assertTrue(generateCode1.length() == 4);
    System.out.println(generateCode1);
    try {
      Integer.valueOf(generateCode1);
      Assert.fail();
      return;
    } catch (NumberFormatException e) {

    }
    String generateCode2 = validata.create();
    Assert.assertEquals(generateCode2, validata.getLastCheck());
  }

}
