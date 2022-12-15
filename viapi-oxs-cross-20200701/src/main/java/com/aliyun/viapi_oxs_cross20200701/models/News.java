// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class News extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Last")
    public Boolean last;

    @NameInMap("Pic")
    public String pic;

    @NameInMap("Sort")
    public Integer sort;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Url")
    public String url;

    public static News build(java.util.Map<String, ?> map) throws Exception {
        News self = new News();
        return TeaModel.build(map, self);
    }

    public News setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public News setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public News setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public News setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public News setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public News setPic(String pic) {
        this.pic = pic;
        return this;
    }
    public String getPic() {
        return this.pic;
    }

    public News setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
    public Integer getSort() {
        return this.sort;
    }

    public News setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public News setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public News setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public News setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public News setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
