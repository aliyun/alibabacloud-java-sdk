// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class Style extends TeaModel {
    @NameInMap("Content")
    public String content;

    public static Style build(java.util.Map<String, ?> map) throws Exception {
        Style self = new Style();
        return TeaModel.build(map, self);
    }

    public Style setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
