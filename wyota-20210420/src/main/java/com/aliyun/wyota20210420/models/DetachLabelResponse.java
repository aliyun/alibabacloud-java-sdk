// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DetachLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachLabelResponseBody body;

    public static DetachLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachLabelResponse self = new DetachLabelResponse();
        return TeaModel.build(map, self);
    }

    public DetachLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachLabelResponse setBody(DetachLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachLabelResponseBody getBody() {
        return this.body;
    }

}
