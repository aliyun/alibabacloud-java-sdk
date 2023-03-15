// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CheckDeveloperRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PermissionResult body;

    public static CheckDeveloperRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDeveloperRoleResponse self = new CheckDeveloperRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckDeveloperRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDeveloperRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDeveloperRoleResponse setBody(PermissionResult body) {
        this.body = body;
        return this;
    }
    public PermissionResult getBody() {
        return this.body;
    }

}
