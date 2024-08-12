// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AttachLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachLabelsResponseBody body;

    public static AttachLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachLabelsResponse self = new AttachLabelsResponse();
        return TeaModel.build(map, self);
    }

    public AttachLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachLabelsResponse setBody(AttachLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachLabelsResponseBody getBody() {
        return this.body;
    }

}
