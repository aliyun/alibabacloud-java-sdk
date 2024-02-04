// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartOmsOpenAPIProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartOmsOpenAPIProjectResponseBody body;

    public static StartOmsOpenAPIProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        StartOmsOpenAPIProjectResponse self = new StartOmsOpenAPIProjectResponse();
        return TeaModel.build(map, self);
    }

    public StartOmsOpenAPIProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartOmsOpenAPIProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartOmsOpenAPIProjectResponse setBody(StartOmsOpenAPIProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public StartOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

}
