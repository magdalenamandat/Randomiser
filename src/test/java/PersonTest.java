import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

        private Person person;

        @Before
        public void before() {
            this.person = new Person("Magda", "Mandat", 28, "f");
        }

        @Test
        public void hasFirstName(){
            assertEquals("Magda", person.getFirstName());
        }

        @Test
        public void hasLastName(){
            assertEquals("Mandat", person.getLastName());
        }

        @Test
        public void hasAge(){
            assertEquals(28, person.getAge());
        }

        @Test
        public void hasGender(){
            assertEquals("f", person.getGender());
        }

        @Test
        public void canSetFirstName(){
            person.setFirstName("Anna");
            assertEquals("Anna", person.getFirstName());
        }

        @Test
        public void canSetLasttName(){
            person.setLastName("Madrala");
            assertEquals("Madrala", person.getLastName());
        }

        @Test
        public void canSetAge(){
            person.setAge(30);
            assertEquals(30, person.getAge());
        }

        @Test
        public void canSetGender(){
            person.setGender("f");
            assertEquals("f", person.getGender());
        }

        }




