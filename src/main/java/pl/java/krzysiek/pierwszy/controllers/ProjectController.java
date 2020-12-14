package pl.java.krzysiek.pierwszy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.java.krzysiek.pierwszy.dao.IProjectRepository;
import pl.java.krzysiek.pierwszy.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    IProjectRepository iProRepo;

    @GetMapping("/new")
    public String displayProjectForm(Model model){

        Project aProject = new Project();
        model.addAttribute("project", aProject);
        return "new-project";
    }

    public String createProject(Project project, Model model) {

        iProRepo.save(project);

        return "redirect:/new";
    }
}
