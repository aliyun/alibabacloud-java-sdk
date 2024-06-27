// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SwitchExpressionVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchExpressionVariableResponseBody body;

    public static SwitchExpressionVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchExpressionVariableResponse self = new SwitchExpressionVariableResponse();
        return TeaModel.build(map, self);
    }

    public SwitchExpressionVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchExpressionVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchExpressionVariableResponse setBody(SwitchExpressionVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchExpressionVariableResponseBody getBody() {
        return this.body;
    }

}
