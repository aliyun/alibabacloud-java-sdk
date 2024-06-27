// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteQueryVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQueryVariableResponseBody body;

    public static DeleteQueryVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQueryVariableResponse self = new DeleteQueryVariableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQueryVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQueryVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQueryVariableResponse setBody(DeleteQueryVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQueryVariableResponseBody getBody() {
        return this.body;
    }

}
