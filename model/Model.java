package vacancyaggregator.model;

import vacancyaggregator.view.View;
import vacancyaggregator.vo.Vacancy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ruslan Zhdan on 27.03.2016.
 */
public class Model
{
    private View view;
    private Provider[] providers;

    public Model(View view, Provider... providers)
    {
        if (view == null || providers == null || providers.length == 0)
            throw new IllegalArgumentException();
        else
        {
            this.view = view;
            this.providers = providers;
        }
    }

    public void selectCity(String city) {
        List<Vacancy> vacancies = new ArrayList<>();
        for (Provider provider : providers) {
            vacancies.addAll(provider.getJavaVacancies(city));
        }
        view.update(vacancies);
    }
}
