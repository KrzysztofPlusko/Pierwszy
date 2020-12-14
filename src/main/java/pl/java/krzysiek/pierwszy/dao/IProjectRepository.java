package pl.java.krzysiek.pierwszy.dao;

import org.springframework.data.repository.CrudRepository;
import pl.java.krzysiek.pierwszy.entities.Project;

public interface IProjectRepository extends CrudRepository<Project, Long> {
}
