// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReleaseOmsOpenAPIProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseOmsOpenAPIProjectResponseBody body;

    public static ReleaseOmsOpenAPIProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseOmsOpenAPIProjectResponse self = new ReleaseOmsOpenAPIProjectResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseOmsOpenAPIProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseOmsOpenAPIProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseOmsOpenAPIProjectResponse setBody(ReleaseOmsOpenAPIProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

}
