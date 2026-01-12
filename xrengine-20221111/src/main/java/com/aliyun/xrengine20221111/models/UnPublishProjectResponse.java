// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class UnPublishProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnPublishProjectResponseBody body;

    public static UnPublishProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UnPublishProjectResponse self = new UnPublishProjectResponse();
        return TeaModel.build(map, self);
    }

    public UnPublishProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnPublishProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnPublishProjectResponse setBody(UnPublishProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UnPublishProjectResponseBody getBody() {
        return this.body;
    }

}
