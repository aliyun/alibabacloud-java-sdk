// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class SuspendHotlineServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendHotlineServiceResponseBody body;

    public static SuspendHotlineServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendHotlineServiceResponse self = new SuspendHotlineServiceResponse();
        return TeaModel.build(map, self);
    }

    public SuspendHotlineServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendHotlineServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendHotlineServiceResponse setBody(SuspendHotlineServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendHotlineServiceResponseBody getBody() {
        return this.body;
    }

}
