import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class PeopleController {

        public static void main(String[] args) {
            VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
            staticFileLocation("/public");

            ArrayList<Person> people = new ArrayList<>();


            Person person1 = new Person("Magda", "Mandat",27, "f");
            people.add(person1);
            Person person2 = new Person("Julia", "Mandat",25, "f");
            people.add(person2);
            Person person3 = new Person("Mark", "Henderson",35, "m");
            people.add(person3);
            Person person4 = new Person("Rod", "Bush",50, "m");
            people.add(person4);
            Person person5 = new Person("Christopher", "Bell",42, "m");
            people.add(person5);




//            get("/people", (req, res) -> {
//
//                HashMap<String, Object> model = new HashMap<>();
//                model.put("people", people);
//                model.put("template", "people.vtl");
//                return new ModelAndView(model, "layout.vtl");
//            }, velocityTemplateEngine);
        }
    }

