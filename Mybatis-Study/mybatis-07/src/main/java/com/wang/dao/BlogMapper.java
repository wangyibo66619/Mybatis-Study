package com.wang.dao;

import com.wang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    // 插入数据
    int addBlog(Blog blog);
    // 查询
    List<Blog> queryBlogIf(Map map);
    // 查询
    List<Blog> queryBlogChoose(Map map);
    // 更新
    int updateBlog(Map map);

    // 查询第1-2-3号记录的博客
    List<Blog> queryBlogForEach(Map map);

}
