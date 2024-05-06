// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class PublishIndexVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishIndexVersionResponseBody body;

    public static PublishIndexVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishIndexVersionResponse self = new PublishIndexVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishIndexVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishIndexVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishIndexVersionResponse setBody(PublishIndexVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishIndexVersionResponseBody getBody() {
        return this.body;
    }

}
