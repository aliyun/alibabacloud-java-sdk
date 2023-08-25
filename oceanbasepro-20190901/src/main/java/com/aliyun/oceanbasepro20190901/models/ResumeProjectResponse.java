// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ResumeProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeProjectResponseBody body;

    public static ResumeProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeProjectResponse self = new ResumeProjectResponse();
        return TeaModel.build(map, self);
    }

    public ResumeProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeProjectResponse setBody(ResumeProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeProjectResponseBody getBody() {
        return this.body;
    }

}
