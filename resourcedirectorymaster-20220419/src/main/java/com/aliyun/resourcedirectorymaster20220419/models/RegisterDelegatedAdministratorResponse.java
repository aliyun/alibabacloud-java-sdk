// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class RegisterDelegatedAdministratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterDelegatedAdministratorResponseBody body;

    public static RegisterDelegatedAdministratorResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterDelegatedAdministratorResponse self = new RegisterDelegatedAdministratorResponse();
        return TeaModel.build(map, self);
    }

    public RegisterDelegatedAdministratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterDelegatedAdministratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterDelegatedAdministratorResponse setBody(RegisterDelegatedAdministratorResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterDelegatedAdministratorResponseBody getBody() {
        return this.body;
    }

}
