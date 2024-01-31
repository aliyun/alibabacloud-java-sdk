// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOpaStrategyNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOpaStrategyNewResponseBody body;

    public static UpdateOpaStrategyNewResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOpaStrategyNewResponse self = new UpdateOpaStrategyNewResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOpaStrategyNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOpaStrategyNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOpaStrategyNewResponse setBody(UpdateOpaStrategyNewResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOpaStrategyNewResponseBody getBody() {
        return this.body;
    }

}
