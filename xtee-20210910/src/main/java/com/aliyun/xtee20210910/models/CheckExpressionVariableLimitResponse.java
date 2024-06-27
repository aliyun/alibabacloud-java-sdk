// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckExpressionVariableLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckExpressionVariableLimitResponseBody body;

    public static CheckExpressionVariableLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckExpressionVariableLimitResponse self = new CheckExpressionVariableLimitResponse();
        return TeaModel.build(map, self);
    }

    public CheckExpressionVariableLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckExpressionVariableLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckExpressionVariableLimitResponse setBody(CheckExpressionVariableLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckExpressionVariableLimitResponseBody getBody() {
        return this.body;
    }

}
