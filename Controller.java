package vacancyaggregator;

import vacancyaggregator.model.Model;

/**
 * Created by Ruslan Zhdan on 25.03.2016.
 */
public class Controller
{

    private Model model;

    public Controller(Model model)
    {
        if(model == null)
            throw new IllegalArgumentException();
        this.model = model;
    }

    public void onCitySelect(String cityName){
        model.selectCity(cityName);
    }
}
