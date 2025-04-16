// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class CancelAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelAsyncTaskResponseBody body;

    public static CancelAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAsyncTaskResponse self = new CancelAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAsyncTaskResponse setBody(CancelAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
