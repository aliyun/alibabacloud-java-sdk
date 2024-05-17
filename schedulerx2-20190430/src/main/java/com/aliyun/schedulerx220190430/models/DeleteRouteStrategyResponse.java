// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteRouteStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRouteStrategyResponseBody body;

    public static DeleteRouteStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteStrategyResponse self = new DeleteRouteStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteStrategyResponse setBody(DeleteRouteStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteStrategyResponseBody getBody() {
        return this.body;
    }

}
