// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAlertStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertStrategyResponseBody body;

    public static GetAlertStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertStrategyResponse self = new GetAlertStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertStrategyResponse setBody(GetAlertStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertStrategyResponseBody getBody() {
        return this.body;
    }

}
