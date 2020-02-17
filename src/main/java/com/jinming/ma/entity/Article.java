package com.jinming.ma.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author majm
 * @create 2020-02-17 16:29
 * @desc
 **/
@Entity(name = "t_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private Date created;
    private Date modified;
    private String categories;
    private String tags;
    @Column(name = "allow_comment")
    private Integer allowComment;
    private String thumbnail;


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }

    public String getCategories() {
        return categories;
    }

    public String getTags() {
        return tags;
    }

    public Integer getAllowComment() {
        return allowComment;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setAllowComment(Integer allowComment) {
        this.allowComment = allowComment;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", categories='" + categories + '\'' +
                ", tags='" + tags + '\'' +
                ", allowComment=" + allowComment +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
