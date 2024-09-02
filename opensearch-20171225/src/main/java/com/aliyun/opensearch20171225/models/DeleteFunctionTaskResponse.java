// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteFunctionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFunctionTaskResponseBody body;

    public static DeleteFunctionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionTaskResponse self = new DeleteFunctionTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFunctionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFunctionTaskResponse setBody(DeleteFunctionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFunctionTaskResponseBody getBody() {
        return this.body;
    }

}
