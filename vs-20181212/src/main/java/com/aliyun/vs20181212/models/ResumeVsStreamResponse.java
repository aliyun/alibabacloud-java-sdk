// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ResumeVsStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeVsStreamResponseBody body;

    public static ResumeVsStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeVsStreamResponse self = new ResumeVsStreamResponse();
        return TeaModel.build(map, self);
    }

    public ResumeVsStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeVsStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeVsStreamResponse setBody(ResumeVsStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeVsStreamResponseBody getBody() {
        return this.body;
    }

}
