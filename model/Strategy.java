package vacancyaggregator.model;

import vacancyaggregator.vo.Vacancy;

import java.util.List;

/**
 * Created by Ruslan Zhdan on 24.03.2016.
 */
public interface Strategy
{
    List<Vacancy> getVacancies(String searchString);
}
