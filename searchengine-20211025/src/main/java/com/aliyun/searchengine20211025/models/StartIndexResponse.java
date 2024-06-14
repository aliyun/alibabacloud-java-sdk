// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class StartIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartIndexResponseBody body;

    public static StartIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        StartIndexResponse self = new StartIndexResponse();
        return TeaModel.build(map, self);
    }

    public StartIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartIndexResponse setBody(StartIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public StartIndexResponseBody getBody() {
        return this.body;
    }

}
