// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckTrafficControlTaskExpressionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckTrafficControlTaskExpressionResponseBody body;

    public static CheckTrafficControlTaskExpressionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckTrafficControlTaskExpressionResponse self = new CheckTrafficControlTaskExpressionResponse();
        return TeaModel.build(map, self);
    }

    public CheckTrafficControlTaskExpressionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckTrafficControlTaskExpressionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckTrafficControlTaskExpressionResponse setBody(CheckTrafficControlTaskExpressionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckTrafficControlTaskExpressionResponseBody getBody() {
        return this.body;
    }

}
