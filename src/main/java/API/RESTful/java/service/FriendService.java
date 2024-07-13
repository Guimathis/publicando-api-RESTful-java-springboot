package API.RESTful.java.service;

import API.RESTful.java.domain.model.Friend;

public interface FriendService {
    Friend FindById(Long id);

    Friend Create(Friend friend);
}
