// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ViewChild extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    // title
    @NameInMap("title")
    public String title;

    public static ViewChild build(java.util.Map<String, ?> map) throws Exception {
        ViewChild self = new ViewChild();
        return TeaModel.build(map, self);
    }

    public ViewChild setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ViewChild setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
