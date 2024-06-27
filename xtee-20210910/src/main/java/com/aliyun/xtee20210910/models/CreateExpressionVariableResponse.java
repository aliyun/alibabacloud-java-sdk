// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateExpressionVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExpressionVariableResponseBody body;

    public static CreateExpressionVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressionVariableResponse self = new CreateExpressionVariableResponse();
        return TeaModel.build(map, self);
    }

    public CreateExpressionVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExpressionVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExpressionVariableResponse setBody(CreateExpressionVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExpressionVariableResponseBody getBody() {
        return this.body;
    }

}
