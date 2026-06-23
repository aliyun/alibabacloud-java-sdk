// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class PublishMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishMessageResponseBody body;

    public static PublishMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishMessageResponse self = new PublishMessageResponse();
        return TeaModel.build(map, self);
    }

    public PublishMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishMessageResponse setBody(PublishMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishMessageResponseBody getBody() {
        return this.body;
    }

}
