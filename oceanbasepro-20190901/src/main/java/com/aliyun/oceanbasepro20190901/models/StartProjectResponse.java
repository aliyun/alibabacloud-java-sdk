// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartProjectResponseBody body;

    public static StartProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        StartProjectResponse self = new StartProjectResponse();
        return TeaModel.build(map, self);
    }

    public StartProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartProjectResponse setBody(StartProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public StartProjectResponseBody getBody() {
        return this.body;
    }

}
