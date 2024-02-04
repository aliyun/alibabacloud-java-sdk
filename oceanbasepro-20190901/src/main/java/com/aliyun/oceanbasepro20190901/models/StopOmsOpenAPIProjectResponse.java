// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopOmsOpenAPIProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopOmsOpenAPIProjectResponseBody body;

    public static StopOmsOpenAPIProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        StopOmsOpenAPIProjectResponse self = new StopOmsOpenAPIProjectResponse();
        return TeaModel.build(map, self);
    }

    public StopOmsOpenAPIProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopOmsOpenAPIProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopOmsOpenAPIProjectResponse setBody(StopOmsOpenAPIProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public StopOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

}
