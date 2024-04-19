// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateWarningStrategyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWarningStrategyConfigResponseBody body;

    public static CreateWarningStrategyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWarningStrategyConfigResponse self = new CreateWarningStrategyConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateWarningStrategyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWarningStrategyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWarningStrategyConfigResponse setBody(CreateWarningStrategyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWarningStrategyConfigResponseBody getBody() {
        return this.body;
    }

}
