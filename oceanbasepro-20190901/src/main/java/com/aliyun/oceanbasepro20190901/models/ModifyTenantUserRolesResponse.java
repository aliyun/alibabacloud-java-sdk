// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTenantUserRolesResponseBody body;

    public static ModifyTenantUserRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserRolesResponse self = new ModifyTenantUserRolesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantUserRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTenantUserRolesResponse setBody(ModifyTenantUserRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantUserRolesResponseBody getBody() {
        return this.body;
    }

}
