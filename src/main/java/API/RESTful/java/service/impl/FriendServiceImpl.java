package API.RESTful.java.service.impl;

import API.RESTful.java.domain.model.Friend;
import API.RESTful.java.domain.repository.FriendRepository;
import API.RESTful.java.service.FriendService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class FriendServiceImpl implements FriendService {

    private final FriendRepository friendRepository;

    public FriendServiceImpl(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

    @Override
    public Friend FindById(Long id) {
        return friendRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Friend Create(Friend friend) {
        if(friendRepository.findById(friend.getId()).isPresent()) {
            throw new IllegalArgumentException("Já existe um usuário com este id.");
        }
        return friendRepository.save(friend);
    }

}
