// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class SuspendLocationServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendLocationServiceResponseBody body;

    public static SuspendLocationServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendLocationServiceResponse self = new SuspendLocationServiceResponse();
        return TeaModel.build(map, self);
    }

    public SuspendLocationServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendLocationServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendLocationServiceResponse setBody(SuspendLocationServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendLocationServiceResponseBody getBody() {
        return this.body;
    }

}
