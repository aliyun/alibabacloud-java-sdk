// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SkipCurrentStepResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SkipCurrentStepResponseBody body;

    public static SkipCurrentStepResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipCurrentStepResponse self = new SkipCurrentStepResponse();
        return TeaModel.build(map, self);
    }

    public SkipCurrentStepResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipCurrentStepResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SkipCurrentStepResponse setBody(SkipCurrentStepResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipCurrentStepResponseBody getBody() {
        return this.body;
    }

}
