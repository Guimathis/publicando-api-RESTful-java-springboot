package API.RESTful.java.controller;

import API.RESTful.java.domain.model.Friend;
import API.RESTful.java.service.FriendService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class FriendController {
    private final FriendService friendService;
    public FriendController(FriendService friendService) {
        this.friendService = friendService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Friend> findById(@PathVariable Long id) {
        var friend = friendService.FindById(id);
        return ResponseEntity.ok(friend);
    }
    @PostMapping
    public ResponseEntity<Friend> create(@RequestBody Friend friend) {
        var friendCreated = friendService.Create(friend);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(friendCreated.getId()).toUri();
        return ResponseEntity.created(location).body(friendCreated);
    }


}
