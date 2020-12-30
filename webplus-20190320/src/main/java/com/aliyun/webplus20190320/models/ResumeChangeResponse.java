// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class ResumeChangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeChangeResponseBody body;

    public static ResumeChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeChangeResponse self = new ResumeChangeResponse();
        return TeaModel.build(map, self);
    }

    public ResumeChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeChangeResponse setBody(ResumeChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeChangeResponseBody getBody() {
        return this.body;
    }

}
