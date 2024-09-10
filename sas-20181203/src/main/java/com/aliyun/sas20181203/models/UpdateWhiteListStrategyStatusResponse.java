// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateWhiteListStrategyStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWhiteListStrategyStatusResponseBody body;

    public static UpdateWhiteListStrategyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteListStrategyStatusResponse self = new UpdateWhiteListStrategyStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteListStrategyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWhiteListStrategyStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWhiteListStrategyStatusResponse setBody(UpdateWhiteListStrategyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWhiteListStrategyStatusResponseBody getBody() {
        return this.body;
    }

}
