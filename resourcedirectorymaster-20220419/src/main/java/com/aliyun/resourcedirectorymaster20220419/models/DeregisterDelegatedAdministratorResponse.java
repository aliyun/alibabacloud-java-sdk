// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeregisterDelegatedAdministratorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeregisterDelegatedAdministratorResponseBody body;

    public static DeregisterDelegatedAdministratorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeregisterDelegatedAdministratorResponse self = new DeregisterDelegatedAdministratorResponse();
        return TeaModel.build(map, self);
    }

    public DeregisterDelegatedAdministratorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeregisterDelegatedAdministratorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeregisterDelegatedAdministratorResponse setBody(DeregisterDelegatedAdministratorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeregisterDelegatedAdministratorResponseBody getBody() {
        return this.body;
    }

}
