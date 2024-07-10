// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PublishWebApplicationRevisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationRevisionBody body;

    public static PublishWebApplicationRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishWebApplicationRevisionResponse self = new PublishWebApplicationRevisionResponse();
        return TeaModel.build(map, self);
    }

    public PublishWebApplicationRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishWebApplicationRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishWebApplicationRevisionResponse setBody(WebApplicationRevisionBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationRevisionBody getBody() {
        return this.body;
    }

}
