// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAlertStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAlertStrategyResponseBody body;

    public static CreateAlertStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertStrategyResponse self = new CreateAlertStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlertStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlertStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAlertStrategyResponse setBody(CreateAlertStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlertStrategyResponseBody getBody() {
        return this.body;
    }

}
