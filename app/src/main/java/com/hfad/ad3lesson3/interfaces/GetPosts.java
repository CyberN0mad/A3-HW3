package com.hfad.ad3lesson3.interfaces;
import com.hfad.ad3lesson3.data.model.Post;
import java.util.List;

public interface  GetPosts {
    void onSuccess(List<Post> posts);
    void onFailure(String error);
}
