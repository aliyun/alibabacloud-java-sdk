// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ResetOmsOpenAPIProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetOmsOpenAPIProjectResponseBody body;

    public static ResetOmsOpenAPIProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetOmsOpenAPIProjectResponse self = new ResetOmsOpenAPIProjectResponse();
        return TeaModel.build(map, self);
    }

    public ResetOmsOpenAPIProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetOmsOpenAPIProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetOmsOpenAPIProjectResponse setBody(ResetOmsOpenAPIProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

}
