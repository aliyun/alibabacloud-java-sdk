// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class OpenAITaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenAITaskResponseBody body;

    public static OpenAITaskResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAITaskResponse self = new OpenAITaskResponse();
        return TeaModel.build(map, self);
    }

    public OpenAITaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAITaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenAITaskResponse setBody(OpenAITaskResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenAITaskResponseBody getBody() {
        return this.body;
    }

}
