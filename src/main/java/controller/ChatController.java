package controller;

import model.ChatMessageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class ChatController {

//    @GetMapping(value = "/greeting")
//    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }

    private ArrayList<String> list = new ArrayList<>();

    @GetMapping("/sendMessage")
    public String sendMessage(@RequestParam(name = "text", required = false, defaultValue = "Default_Message") String name, Model model) {
        list.add(name);
        model.addAttribute("text", name);
        return "sendMessage";
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.POST)
    public String getMessage() {
        for (String s : list) {
            System.out.println(s);
        }
        return "getMessage";
    }

}
