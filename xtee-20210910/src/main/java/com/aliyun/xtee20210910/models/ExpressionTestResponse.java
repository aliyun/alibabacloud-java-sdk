// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ExpressionTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExpressionTestResponseBody body;

    public static ExpressionTestResponse build(java.util.Map<String, ?> map) throws Exception {
        ExpressionTestResponse self = new ExpressionTestResponse();
        return TeaModel.build(map, self);
    }

    public ExpressionTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExpressionTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExpressionTestResponse setBody(ExpressionTestResponseBody body) {
        this.body = body;
        return this;
    }
    public ExpressionTestResponseBody getBody() {
        return this.body;
    }

}
