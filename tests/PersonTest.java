import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

   private Person person = new Person("Said");

    @Test
    public void getName() throws Exception {
        assertEquals("Said", person.getName());
    }

    @Test
    public void testUnHappyToStart() throws Exception {
        assertFalse(person.isHappy());
    }


    @Test
    public void testHappyAfterPlay() throws Exception {
       // person.playWithPerson();
        assertTrue(person.isHappy());
    }
}