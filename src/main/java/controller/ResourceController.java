package controller;

import dao.Resource;
import service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Наташа on 21.01.2018.
 */
@Controller
public class ResourceController {
    @Autowired
    private ResourceService resourceService;
    @RequestMapping("/")
    public ModelAndView index() {
        String message = "Welcome to Resource Circle!";
        return new ModelAndView("index", "messageInView", message);
    }
    @RequestMapping(value = "/resources", method = RequestMethod.GET)
    public String showAlFilms(ModelMap model) {

        List<Resource> allResources = resourceService.findAllResources();
        model.addAttribute("resources", allResources);
        return "resources/resources";
    }
}
