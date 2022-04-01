// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReport extends TeaModel {
    // children
    @NameInMap("children")
    public java.util.List<ViewChild> children;

    // name
    @NameInMap("name")
    public String name;

    // title
    @NameInMap("title")
    public String title;

    public static GetReport build(java.util.Map<String, ?> map) throws Exception {
        GetReport self = new GetReport();
        return TeaModel.build(map, self);
    }

    public GetReport setChildren(java.util.List<ViewChild> children) {
        this.children = children;
        return this;
    }
    public java.util.List<ViewChild> getChildren() {
        return this.children;
    }

    public GetReport setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetReport setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
