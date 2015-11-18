package com.oleg.tripcomposer.controller;

import com.oleg.tripcomposer.response.Response;
import com.oleg.tripcomposer.service.processService.ProcessService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

    private static final Logger LOGGER = Logger.getLogger("Controller");

    @Autowired
    private ProcessService processService;


    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public String RequestPage() {
        LOGGER.debug("Request to show request page");
        return "requestpage";
    }

    @RequestMapping(value = "/request", method = RequestMethod.POST)
    public String Response(Response response, Model model) {
        LOGGER.debug("Request to show Response page");
        response = processService.processRequest(response.getEcho());
        model.addAttribute("ResponseAttribute", response);
        return "responsepage";
    }






}
