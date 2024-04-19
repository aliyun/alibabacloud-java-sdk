// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetWarningStrategyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWarningStrategyConfigResponseBody body;

    public static GetWarningStrategyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWarningStrategyConfigResponse self = new GetWarningStrategyConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetWarningStrategyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWarningStrategyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWarningStrategyConfigResponse setBody(GetWarningStrategyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWarningStrategyConfigResponseBody getBody() {
        return this.body;
    }

}
