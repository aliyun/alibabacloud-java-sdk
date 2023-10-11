// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopRetryAITryOnTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopRetryAITryOnTaskResponseBody body;

    public static PopRetryAITryOnTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PopRetryAITryOnTaskResponse self = new PopRetryAITryOnTaskResponse();
        return TeaModel.build(map, self);
    }

    public PopRetryAITryOnTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopRetryAITryOnTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopRetryAITryOnTaskResponse setBody(PopRetryAITryOnTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PopRetryAITryOnTaskResponseBody getBody() {
        return this.body;
    }

}
