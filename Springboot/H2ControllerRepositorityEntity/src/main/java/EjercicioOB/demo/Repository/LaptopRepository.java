package EjercicioOB.demo.Repository;

import EjercicioOB.demo.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
