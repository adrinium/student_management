package ro.dexterix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.dexterix.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
