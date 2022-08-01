// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Chart extends TeaModel {
    @NameInMap("action")
    public java.util.Map<String, ?> action;

    @NameInMap("display")
    public java.util.Map<String, ?> display;

    @NameInMap("search")
    public java.util.Map<String, ?> search;

    @NameInMap("title")
    public String title;

    @NameInMap("type")
    public String type;

    public static Chart build(java.util.Map<String, ?> map) throws Exception {
        Chart self = new Chart();
        return TeaModel.build(map, self);
    }

    public Chart setAction(java.util.Map<String, ?> action) {
        this.action = action;
        return this;
    }
    public java.util.Map<String, ?> getAction() {
        return this.action;
    }

    public Chart setDisplay(java.util.Map<String, ?> display) {
        this.display = display;
        return this;
    }
    public java.util.Map<String, ?> getDisplay() {
        return this.display;
    }

    public Chart setSearch(java.util.Map<String, ?> search) {
        this.search = search;
        return this;
    }
    public java.util.Map<String, ?> getSearch() {
        return this.search;
    }

    public Chart setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Chart setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
