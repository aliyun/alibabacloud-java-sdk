// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ResumeOmsOpenAPIProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeOmsOpenAPIProjectResponseBody body;

    public static ResumeOmsOpenAPIProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeOmsOpenAPIProjectResponse self = new ResumeOmsOpenAPIProjectResponse();
        return TeaModel.build(map, self);
    }

    public ResumeOmsOpenAPIProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeOmsOpenAPIProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeOmsOpenAPIProjectResponse setBody(ResumeOmsOpenAPIProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

}
