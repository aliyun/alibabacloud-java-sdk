// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ReindexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReindexResponseBody body;

    public static ReindexResponse build(java.util.Map<String, ?> map) throws Exception {
        ReindexResponse self = new ReindexResponse();
        return TeaModel.build(map, self);
    }

    public ReindexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReindexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReindexResponse setBody(ReindexResponseBody body) {
        this.body = body;
        return this;
    }
    public ReindexResponseBody getBody() {
        return this.body;
    }

}
