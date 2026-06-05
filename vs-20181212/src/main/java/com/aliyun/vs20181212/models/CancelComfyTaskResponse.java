// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CancelComfyTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelComfyTaskResponseBody body;

    public static CancelComfyTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelComfyTaskResponse self = new CancelComfyTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelComfyTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelComfyTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelComfyTaskResponse setBody(CancelComfyTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelComfyTaskResponseBody getBody() {
        return this.body;
    }

}
