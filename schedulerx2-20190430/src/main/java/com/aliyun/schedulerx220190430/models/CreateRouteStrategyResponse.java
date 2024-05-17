// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateRouteStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRouteStrategyResponseBody body;

    public static CreateRouteStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteStrategyResponse self = new CreateRouteStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRouteStrategyResponse setBody(CreateRouteStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteStrategyResponseBody getBody() {
        return this.body;
    }

}
