// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ApplyTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyTokenResponseBody body;

    public static ApplyTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyTokenResponse self = new ApplyTokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyTokenResponse setBody(ApplyTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyTokenResponseBody getBody() {
        return this.body;
    }

}
