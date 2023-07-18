package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.car.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    Car car =  new Car();
    @RequestMapping("/")
    public String carsRequest() {
        return "carsRequest";
    }
    @RequestMapping("/carsList")
    public String checkCarList(@RequestParam("quantity") Integer qTy, Model model) {
        List<Car> cars = new ArrayList<>();
        if (qTy >= 5) {
            cars = car.getCarList();
        } else {
            for (int i = 0; i < qTy; i++) {
                cars.add(car.getCarList().get(i));
            }
        }

        model.addAttribute("cars", cars);

        return "carsList";
    }
}
