// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ResumeLocationServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeLocationServiceResponseBody body;

    public static ResumeLocationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeLocationServiceResponse self = new ResumeLocationServiceResponse();
        return TeaModel.build(map, self);
    }

    public ResumeLocationServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeLocationServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeLocationServiceResponse setBody(ResumeLocationServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeLocationServiceResponseBody getBody() {
        return this.body;
    }

}
