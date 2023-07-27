// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class StyleInfo extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("LastModifyTime")
    public String lastModifyTime;

    @NameInMap("Name")
    public String name;

    public static StyleInfo build(java.util.Map<String, ?> map) throws Exception {
        StyleInfo self = new StyleInfo();
        return TeaModel.build(map, self);
    }

    public StyleInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public StyleInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public StyleInfo setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    public StyleInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
