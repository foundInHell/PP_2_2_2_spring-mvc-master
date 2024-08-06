package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.CarDao;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @Autowired
    private CarDao carDao;

    @GetMapping("/cars")
    public String showCars(HttpServletRequest req, Model model){
        String count = req.getParameter("count");
        if(count == null) model.addAttribute("cars", carDao.getCars(5));
        else model.addAttribute("cars", carDao.getCars(Integer.parseInt(count)));
        return "cars";
    }
}
