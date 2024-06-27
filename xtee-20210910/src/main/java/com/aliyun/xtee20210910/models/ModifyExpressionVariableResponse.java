// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyExpressionVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyExpressionVariableResponseBody body;

    public static ModifyExpressionVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressionVariableResponse self = new ModifyExpressionVariableResponse();
        return TeaModel.build(map, self);
    }

    public ModifyExpressionVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyExpressionVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyExpressionVariableResponse setBody(ModifyExpressionVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyExpressionVariableResponseBody getBody() {
        return this.body;
    }

}
