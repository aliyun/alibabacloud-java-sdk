// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteOpaStrategyNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteOpaStrategyNewResponseBody body;

    public static DeleteOpaStrategyNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpaStrategyNewResponse self = new DeleteOpaStrategyNewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOpaStrategyNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOpaStrategyNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteOpaStrategyNewResponse setBody(DeleteOpaStrategyNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOpaStrategyNewResponseBody getBody() {
        return this.body;
    }

}
