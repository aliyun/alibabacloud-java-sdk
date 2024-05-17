// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchDeleteRouteStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteRouteStrategyResponseBody body;

    public static BatchDeleteRouteStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteRouteStrategyResponse self = new BatchDeleteRouteStrategyResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteRouteStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteRouteStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteRouteStrategyResponse setBody(BatchDeleteRouteStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteRouteStrategyResponseBody getBody() {
        return this.body;
    }

}
