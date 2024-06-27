// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteExpressionVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExpressionVariableResponseBody body;

    public static DeleteExpressionVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressionVariableResponse self = new DeleteExpressionVariableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpressionVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpressionVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExpressionVariableResponse setBody(DeleteExpressionVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpressionVariableResponseBody getBody() {
        return this.body;
    }

}
