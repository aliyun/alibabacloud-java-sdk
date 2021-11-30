// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutObjectRequest extends TeaModel {
    @NameInMap("body")
    public java.io.InputStream body;

    public static PutObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PutObjectRequest self = new PutObjectRequest();
        return TeaModel.build(map, self);
    }

    public PutObjectRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
