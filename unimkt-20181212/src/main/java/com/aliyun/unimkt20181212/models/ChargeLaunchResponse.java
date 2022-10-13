// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChargeLaunchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChargeLaunchResponseBody body;

    public static ChargeLaunchResponse build(java.util.Map<String, ?> map) throws Exception {
        ChargeLaunchResponse self = new ChargeLaunchResponse();
        return TeaModel.build(map, self);
    }

    public ChargeLaunchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChargeLaunchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChargeLaunchResponse setBody(ChargeLaunchResponseBody body) {
        this.body = body;
        return this;
    }
    public ChargeLaunchResponseBody getBody() {
        return this.body;
    }

}
