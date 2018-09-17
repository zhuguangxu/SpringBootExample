package com.example.quickstart.dao;

import com.example.quickstart.entity.Picture;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class PictureDAO {
    public List<Picture> getPicture(){
        Picture[] pictures = {
                new Picture("跑步好搭档","one.png"), new Picture("给现代人的生活小技巧","two.png"),
                new Picture("青年居家生活指南","three.png"), new Picture("你应该知道的PPT技巧","four.png"),
                new Picture("玩转Workflow","6.png"),new Picture("如何提升编码效率？","7.png"),
        };
        List<Picture> pictureList = Arrays.asList(pictures);
        return pictureList;
    }
}
