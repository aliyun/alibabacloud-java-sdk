// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteCustomAuthIdentityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomAuthIdentityResponseBody body;

    public static DeleteCustomAuthIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomAuthIdentityResponse self = new DeleteCustomAuthIdentityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomAuthIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomAuthIdentityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomAuthIdentityResponse setBody(DeleteCustomAuthIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomAuthIdentityResponseBody getBody() {
        return this.body;
    }

}
