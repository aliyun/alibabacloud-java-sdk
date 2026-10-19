// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RegisterAppResourcePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterAppResourcePermissionsResponseBody body;

    public static RegisterAppResourcePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterAppResourcePermissionsResponse self = new RegisterAppResourcePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public RegisterAppResourcePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterAppResourcePermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterAppResourcePermissionsResponse setBody(RegisterAppResourcePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterAppResourcePermissionsResponseBody getBody() {
        return this.body;
    }

}
