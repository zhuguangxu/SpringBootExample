package com.example.quickstart.controller;

import com.example.quickstart.dao.LeftDAO;
import com.example.quickstart.dao.PictureDAO;
import com.example.quickstart.entity.Left;
import com.example.quickstart.entity.Picture;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class Index1Controller {
    @Resource
    private LeftDAO leftDAO;
    @Resource
    private PictureDAO pictureDAO;
    @GetMapping("index1")
    public String getLeft(ModelMap map){
        //内容部分左半边引入数据
        List<Left> leftList = leftDAO.getLeft();
        map.addAttribute("leftList", leftList);
        //内容部分右半边引入数据
            List<Picture> pictureList = pictureDAO.getPicture();
            map.addAttribute("pictureList",pictureList);

        return "index1";
    }
}
