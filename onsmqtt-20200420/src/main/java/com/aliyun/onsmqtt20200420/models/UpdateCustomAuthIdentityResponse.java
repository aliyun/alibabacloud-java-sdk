// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UpdateCustomAuthIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomAuthIdentityResponseBody body;

    public static UpdateCustomAuthIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAuthIdentityResponse self = new UpdateCustomAuthIdentityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAuthIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomAuthIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomAuthIdentityResponse setBody(UpdateCustomAuthIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomAuthIdentityResponseBody getBody() {
        return this.body;
    }

}
