// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class StartSDKInstanceProductionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartSDKInstanceProductionResponseBody body;

    public static StartSDKInstanceProductionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSDKInstanceProductionResponse self = new StartSDKInstanceProductionResponse();
        return TeaModel.build(map, self);
    }

    public StartSDKInstanceProductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSDKInstanceProductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSDKInstanceProductionResponse setBody(StartSDKInstanceProductionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSDKInstanceProductionResponseBody getBody() {
        return this.body;
    }

}
