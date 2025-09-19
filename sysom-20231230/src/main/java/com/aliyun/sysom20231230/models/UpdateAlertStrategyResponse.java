// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAlertStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertStrategyResponseBody body;

    public static UpdateAlertStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertStrategyResponse self = new UpdateAlertStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertStrategyResponse setBody(UpdateAlertStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertStrategyResponseBody getBody() {
        return this.body;
    }

}
