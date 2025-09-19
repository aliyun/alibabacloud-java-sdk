// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteAlertStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertStrategyResponseBody body;

    public static DeleteAlertStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertStrategyResponse self = new DeleteAlertStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertStrategyResponse setBody(DeleteAlertStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertStrategyResponseBody getBody() {
        return this.body;
    }

}
