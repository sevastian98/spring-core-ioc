package pixel.academy.spring_core_ioc;

import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Prepara pasta al pomodoro with fresh tomates and basil!";
    }
}
