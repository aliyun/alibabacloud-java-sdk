// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DetachLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachLabelsResponseBody body;

    public static DetachLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachLabelsResponse self = new DetachLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DetachLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachLabelsResponse setBody(DetachLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachLabelsResponseBody getBody() {
        return this.body;
    }

}
