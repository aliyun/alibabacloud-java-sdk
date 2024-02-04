// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CloseAITaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseAITaskResponseBody body;

    public static CloseAITaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseAITaskResponse self = new CloseAITaskResponse();
        return TeaModel.build(map, self);
    }

    public CloseAITaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseAITaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseAITaskResponse setBody(CloseAITaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseAITaskResponseBody getBody() {
        return this.body;
    }

}
