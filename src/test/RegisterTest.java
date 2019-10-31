package test;

import org.junit.jupiter.api.Test;
import student.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegister() {
        List<Nameable> nameables = Arrays.asList(
                new Student("Dorren", Level.FOURTH, Arrays.asList(1.2,2.2)),
                new Student("Yaa", Level.FIRST, Arrays.asList(4.4,5.5)),
                new NaughtyStudent("Akos",Level.SECOND,Arrays.asList(7.2,1.8))
        );
       Register register = new Register(nameables);
       List<String> expected = Arrays.asList("Dorren","Yaa","Akos");
       assertEquals(expected,register.getRegister());
    }

    @Test
    void getRegisterByLevel() {
        List<Nameable> nameables = Arrays.asList(
                new Student("Dorren", Level.FOURTH, Arrays.asList(1.2,2.2)),
                new Student("Yaa", Level.FIRST, Arrays.asList(4.4,5.5)),
                new NaughtyStudent("Akos",Level.SECOND,Arrays.asList(7.2,1.8))
        );
        Register register = new Register(nameables);
        List<String> expected = Arrays.asList("Dorren");
        assertEquals(expected,register.getRegisterByLevel(Level.FOURTH));
    }
}