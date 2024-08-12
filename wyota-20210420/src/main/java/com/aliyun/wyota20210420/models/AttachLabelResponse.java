// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AttachLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachLabelResponseBody body;

    public static AttachLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachLabelResponse self = new AttachLabelResponse();
        return TeaModel.build(map, self);
    }

    public AttachLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachLabelResponse setBody(AttachLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachLabelResponseBody getBody() {
        return this.body;
    }

}
