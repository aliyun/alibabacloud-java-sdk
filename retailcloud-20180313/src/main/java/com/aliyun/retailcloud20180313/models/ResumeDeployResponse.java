// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ResumeDeployResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeDeployResponseBody body;

    public static ResumeDeployResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeDeployResponse self = new ResumeDeployResponse();
        return TeaModel.build(map, self);
    }

    public ResumeDeployResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeDeployResponse setBody(ResumeDeployResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeDeployResponseBody getBody() {
        return this.body;
    }

}
