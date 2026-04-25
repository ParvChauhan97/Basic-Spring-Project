package com.system.user.UserSystem.Controler;
import com.system.user.UserSystem.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

//URL Path endpoint...
@RequestMapping("/User")
public class TakingControl {

    public TakingControl(UserService userservice) {
        this.userservice = userservice;
    }

    UserService userservice;

    //User Create:--
    @PostMapping()
    public ResponseEntity<UserControl> Control(@RequestBody UserControl userC) {
        return userservice.createUser(userC);
    }

    //User Update:--
    @PutMapping
    public ResponseEntity<String> Update(@RequestBody UserControl userC) {
       return userservice.updateUser(userC);
    }

    //User Deletion:--
   @DeleteMapping("/id/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
       return userservice.deleteUser(id);
   }

   //Return List of All Users:--
   @GetMapping("/print")
    public List<UserControl> get() {
        return userservice.list();
   }

   @GetMapping("/{id}")
    public ResponseEntity<String> info(@PathVariable int id) {
        return userservice.userinfo(id);
   }

  
   @GetMapping("/{id}/order/{orderId}")
    public ResponseEntity<String> Order(@PathVariable int id,
                                            @PathVariable("orderId") int OrderKiId) {
      return userservice.userOrder(id, OrderKiId);
   }

   
    @GetMapping("/search")
    public ResponseEntity<List<UserControl>>
                         AllData(@RequestParam(required = false, defaultValue = "default") String name) {
        return userservice.UserData(name);
    }

}
