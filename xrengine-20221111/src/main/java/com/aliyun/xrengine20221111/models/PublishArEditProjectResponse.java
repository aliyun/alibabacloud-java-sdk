// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class PublishArEditProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishArEditProjectResponseBody body;

    public static PublishArEditProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishArEditProjectResponse self = new PublishArEditProjectResponse();
        return TeaModel.build(map, self);
    }

    public PublishArEditProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishArEditProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishArEditProjectResponse setBody(PublishArEditProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishArEditProjectResponseBody getBody() {
        return this.body;
    }

}
