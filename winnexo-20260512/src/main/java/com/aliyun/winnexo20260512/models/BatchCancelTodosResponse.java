// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchCancelTodosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCancelTodosResponseBody body;

    public static BatchCancelTodosResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCancelTodosResponse self = new BatchCancelTodosResponse();
        return TeaModel.build(map, self);
    }

    public BatchCancelTodosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCancelTodosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCancelTodosResponse setBody(BatchCancelTodosResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCancelTodosResponseBody getBody() {
        return this.body;
    }

}
