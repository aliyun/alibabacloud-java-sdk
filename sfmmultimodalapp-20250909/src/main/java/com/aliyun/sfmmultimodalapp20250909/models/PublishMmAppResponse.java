// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class PublishMmAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishMmAppResponseBody body;

    public static PublishMmAppResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishMmAppResponse self = new PublishMmAppResponse();
        return TeaModel.build(map, self);
    }

    public PublishMmAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishMmAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishMmAppResponse setBody(PublishMmAppResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishMmAppResponseBody getBody() {
        return this.body;
    }

}
