package controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Holder;
import java.util.ArrayList;

@RestController
public class ChatController {

    private ArrayList<Holder> list = new ArrayList<>();

    @RequestMapping(value = "/sendMessage", method = RequestMethod.POST, consumes = {"application/json ; charset=utf-8"})
    @ResponseStatus(HttpStatus.OK)
    //public String sendMessage(@RequestParam(name = "text", required = false, defaultValue = "Default_Message") String name, Model model) {
    @ResponseBody
    public String sendMessage(@RequestBody Holder holder) {
        list.add(holder);
        return "Message sent";
    }

    @GetMapping(value = "/getMessage")
    public ArrayList<Holder> getMessage() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        return list;
    }

}
