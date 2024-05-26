package blog.blog.controllers;

import blog.blog.entities.PostEntity;
import blog.blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@CrossOrigin(origins = "*")
public class BlogController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public List<PostEntity> blog() {
        return postRepository.findAll();
    }

    @GetMapping("/{id}")
    public PostEntity blog(@PathVariable Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @PostMapping
    public PostEntity createPost(@RequestBody PostEntity post) {
        return postRepository.save(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
    }
}
