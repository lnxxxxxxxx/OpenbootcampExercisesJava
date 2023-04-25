package EjercicioOB.demo.Controller;

import EjercicioOB.demo.Model.Laptop;
import EjercicioOB.demo.Repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LaptopController {

    private final LaptopRepository laptopRepository;

    @Autowired
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    @ResponseBody
    public Iterable<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }
}
