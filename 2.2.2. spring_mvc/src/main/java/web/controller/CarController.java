package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "locale", required = false) String locale, ModelMap model) {

        String tableNameRu = "МАШИНЫ";
        String tableNameEn = "CARS";
        CarService carService = new CarService();
        List<Car> cars = carService.getCarsList();
        model.addAttribute("cars", cars);
        if (locale.equals("en")) {
            model.addAttribute("locale", tableNameEn);
        }
        else if (locale.equals("ru")) {
            model.addAttribute("locale", tableNameRu);
        }
        return "cars";

    }

}
