// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class AddCustomAuthIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCustomAuthIdentityResponseBody body;

    public static AddCustomAuthIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAuthIdentityResponse self = new AddCustomAuthIdentityResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomAuthIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomAuthIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomAuthIdentityResponse setBody(AddCustomAuthIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomAuthIdentityResponseBody getBody() {
        return this.body;
    }

}
