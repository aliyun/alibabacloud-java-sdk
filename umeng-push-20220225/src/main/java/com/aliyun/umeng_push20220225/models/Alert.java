// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class Alert extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("subtitle")
    public String subtitle;

    @NameInMap("title")
    public String title;

    public static Alert build(java.util.Map<String, ?> map) throws Exception {
        Alert self = new Alert();
        return TeaModel.build(map, self);
    }

    public Alert setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public Alert setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }
    public String getSubtitle() {
        return this.subtitle;
    }

    public Alert setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
