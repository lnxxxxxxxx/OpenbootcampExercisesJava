package EjercicioOB.demo;

import EjercicioOB.demo.Model.Laptop;
import EjercicioOB.demo.Repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	private final LaptopRepository laptopRepository;

	public DemoApplication(LaptopRepository laptopRepository) {
		this.laptopRepository = laptopRepository;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		// Crear una nueva instancia de Laptop
		Laptop laptop = new Laptop();
		laptop.setMarca("Lenovo");
		laptop.setNumSerie(123456);
		laptop.setProcesador("Intel Core i5");

		Laptop laptop2 = new Laptop();
		laptop2.setMarca("Apple");
		laptop2.setNumSerie(123456);
		laptop2.setProcesador("Intel Core i5");

		Laptop laptop3 = new Laptop();
		laptop3.setMarca("Samsung");
		laptop3.setNumSerie(123456);
		laptop3.setProcesador("Intel Core i5");

		Laptop laptop4 = new Laptop();
		laptop4.setMarca("Samsung");
		laptop4.setNumSerie(123456);
		laptop4.setProcesador("Intel Core i5");


		// Guardar la instancia en la base de datos
		laptopRepository.save(laptop);
		laptopRepository.save(laptop2);
		laptopRepository.save(laptop3);
		laptopRepository.save(laptop4);


		// Imprimir todas las laptops guardadas en la base de datos
		System.out.println(laptopRepository.findAll());
	}
}
