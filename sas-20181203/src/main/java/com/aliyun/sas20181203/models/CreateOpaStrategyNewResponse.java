// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOpaStrategyNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOpaStrategyNewResponseBody body;

    public static CreateOpaStrategyNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpaStrategyNewResponse self = new CreateOpaStrategyNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpaStrategyNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpaStrategyNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOpaStrategyNewResponse setBody(CreateOpaStrategyNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpaStrategyNewResponseBody getBody() {
        return this.body;
    }

}
