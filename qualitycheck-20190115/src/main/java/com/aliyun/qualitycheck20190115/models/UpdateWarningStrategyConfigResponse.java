// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateWarningStrategyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWarningStrategyConfigResponseBody body;

    public static UpdateWarningStrategyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarningStrategyConfigResponse self = new UpdateWarningStrategyConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWarningStrategyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWarningStrategyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWarningStrategyConfigResponse setBody(UpdateWarningStrategyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWarningStrategyConfigResponseBody getBody() {
        return this.body;
    }

}
