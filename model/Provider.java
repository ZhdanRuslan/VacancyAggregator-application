package vacancyaggregator.model;

import vacancyaggregator.vo.Vacancy;

import java.util.List;

/**
 * Created by Ruslan Zhdan on 24.03.2016.
 */
public class Provider
{
    private Strategy strategy;

    public Provider(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public List<Vacancy> getJavaVacancies(String searchString)
    {
        return strategy.getVacancies(searchString);
    }
}
