package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public ArrayList<Post> getAllPosts() {
        ArrayList<Post> postList = new ArrayList<>();

        Post post = new Post();

        post.setTitle("Post 1");
        post.setBody("Post Body 1");
        post.setDate(new Date());


        Post post2 = new Post();

        post2.setTitle("Post 2");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());


        Post post3 = new Post();

        post3.setTitle("Post 3");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());


        postList.add(post);
        postList.add(post2);
        postList.add(post3);

        return postList;
    }
}
