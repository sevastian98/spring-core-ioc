package pixel.academy.spring_core_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Chef myChef;

    //contstructor
    @Autowired
    public DemoController(Chef theChef) {

        myChef = theChef;
    }

    @GetMapping("/dalyrepice")
    public String getDalyRepice() {
        return myChef.getDailyRecipe();
    }
}
