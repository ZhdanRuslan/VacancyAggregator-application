package vacancyaggregator;

import vacancyaggregator.model.HHStrategy;
import vacancyaggregator.model.Model;
import vacancyaggregator.model.MoikrugStrategy;
import vacancyaggregator.model.Provider;
import vacancyaggregator.view.HtmlView;

/**
 * Created by Ruslan Zhdan on 24.03.2016.
 */
public class Aggregator
{
    public static void main(String[] args)
    {
        HHStrategy strategyHH = new HHStrategy();
        MoikrugStrategy strategyMK = new MoikrugStrategy();

        Provider providerHH = new Provider(strategyHH);
        Provider providerMK = new Provider(strategyMK);

        HtmlView view = new HtmlView();
        Model model = new Model(view, providerHH, providerMK);

        view.setController(new Controller(model));
        view.userCitySelectEmulationMethod();
    }
}
