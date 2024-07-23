// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ApplyEngineConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyEngineConfigResponseBody body;

    public static ApplyEngineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyEngineConfigResponse self = new ApplyEngineConfigResponse();
        return TeaModel.build(map, self);
    }

    public ApplyEngineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyEngineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyEngineConfigResponse setBody(ApplyEngineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyEngineConfigResponseBody getBody() {
        return this.body;
    }

}
