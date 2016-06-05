package vacancyaggregator.view;

import vacancyaggregator.Controller;
import vacancyaggregator.vo.Vacancy;

import java.util.List;

/**
 * Created by Ruslan Zhdan on 27.03.2016.
 */
public interface View
{
    void update(List<Vacancy> vacancies);
    void setController(Controller controller);
}
