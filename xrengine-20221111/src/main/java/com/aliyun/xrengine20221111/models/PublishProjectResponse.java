// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class PublishProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishProjectResponseBody body;

    public static PublishProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishProjectResponse self = new PublishProjectResponse();
        return TeaModel.build(map, self);
    }

    public PublishProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishProjectResponse setBody(PublishProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishProjectResponseBody getBody() {
        return this.body;
    }

}
