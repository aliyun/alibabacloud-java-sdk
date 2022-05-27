// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class DebugServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DebugServiceResponseBody body;

    public static DebugServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DebugServiceResponse self = new DebugServiceResponse();
        return TeaModel.build(map, self);
    }

    public DebugServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DebugServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DebugServiceResponse setBody(DebugServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DebugServiceResponseBody getBody() {
        return this.body;
    }

}
