package com.example.quickstart.dao;

import com.example.quickstart.entity.Left;

import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;


@Configuration
@Data
public class LeftDAO {
    public List<Left> getLeft(){
        Left[] lefts = {
                new Left("1.jpg","少数派编辑部","2天前",
                        "一派 | 苹果秋季发布会你最期待什么新产品？",
                        "如果你没有接触过设计，想要提高点儿设计感，懂得一些「性价比高」的设计常识。这套教程将会是一个很好的开始。",
                        "11.jpg",25,148),
                new Left("2.jpg","化学心情下2","2天前",
                        "工作日让家中电脑不再闲置，其实你可以遥控它做很多事",
                        "如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？",
                        "22.jpg",65,39),
                new Left("3.jpg","Adventure","2天前",
                        "5 种方法，在电脑和手机上告别百度搜索里的广告",
                        "百度上各种广告对用户搜索体验造成的不良影响已不是什么新鲜事。在这篇文章中，我将向大家介绍一些在电脑和手机上减少百度推广广告出现的方法，还你干净快捷的搜索体验。",
                        "33.jpg",154,59),
                new Left("4.jpg","洛世","09月05日",
                        "Chrome 在 10 周年之际发布了新版，除了好看还更安全",
                        "Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。",
                        "44.jpg",65,76),
                new Left("5.jpg","Vanilla","09月04日",
                        "Mac 上最好用的系统清理工具大更新，现在你还可以用它更新应用：CleanMyMac X",
                        "CleanMyMac X 率先在 Setapp 平台上推出，大版本更新不但带来了全新设计的应用界面，还新增了许多实用的工具，满足了 Mac 使用者清理系统的日常需求。",
                        "55.jpg",95,81),
        };
        List<Left> leftList = Arrays.asList(lefts);
        return leftList;
    }
}
