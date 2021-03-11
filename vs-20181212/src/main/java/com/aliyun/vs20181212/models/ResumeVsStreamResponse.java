// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ResumeVsStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ResumeVsStreamResponse setBody(ResumeVsStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeVsStreamResponseBody getBody() {
        return this.body;
    }

}
