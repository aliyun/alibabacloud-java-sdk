// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitAIAppJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIAppJobResponseBody body;

    public static SubmitAIAppJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIAppJobResponse self = new SubmitAIAppJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIAppJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIAppJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIAppJobResponse setBody(SubmitAIAppJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIAppJobResponseBody getBody() {
        return this.body;
    }

}
