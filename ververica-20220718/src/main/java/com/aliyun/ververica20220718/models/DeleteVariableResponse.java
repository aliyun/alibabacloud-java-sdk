// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVariableResponseBody body;

    public static DeleteVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVariableResponse self = new DeleteVariableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVariableResponse setBody(DeleteVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVariableResponseBody getBody() {
        return this.body;
    }

}
