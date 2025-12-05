// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ResumeTrafficResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeTrafficResponseBody body;

    public static ResumeTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeTrafficResponse self = new ResumeTrafficResponse();
        return TeaModel.build(map, self);
    }

    public ResumeTrafficResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeTrafficResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeTrafficResponse setBody(ResumeTrafficResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeTrafficResponseBody getBody() {
        return this.body;
    }

}
