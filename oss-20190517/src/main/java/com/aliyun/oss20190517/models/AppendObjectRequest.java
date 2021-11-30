// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class AppendObjectRequest extends TeaModel {
    @NameInMap("body")
    public java.io.InputStream body;

    @NameInMap("position")
    public Long position;

    public static AppendObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        AppendObjectRequest self = new AppendObjectRequest();
        return TeaModel.build(map, self);
    }

    public AppendObjectRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

    public AppendObjectRequest setPosition(Long position) {
        this.position = position;
        return this;
    }
    public Long getPosition() {
        return this.position;
    }

}
