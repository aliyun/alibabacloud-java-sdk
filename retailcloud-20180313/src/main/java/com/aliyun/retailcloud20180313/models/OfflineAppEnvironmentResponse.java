// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class OfflineAppEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OfflineAppEnvironmentResponseBody body;

    public static OfflineAppEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineAppEnvironmentResponse self = new OfflineAppEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public OfflineAppEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineAppEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineAppEnvironmentResponse setBody(OfflineAppEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineAppEnvironmentResponseBody getBody() {
        return this.body;
    }

}
