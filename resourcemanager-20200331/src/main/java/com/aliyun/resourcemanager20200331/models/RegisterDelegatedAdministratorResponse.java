// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class RegisterDelegatedAdministratorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RegisterDelegatedAdministratorResponse setBody(RegisterDelegatedAdministratorResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterDelegatedAdministratorResponseBody getBody() {
        return this.body;
    }

}
