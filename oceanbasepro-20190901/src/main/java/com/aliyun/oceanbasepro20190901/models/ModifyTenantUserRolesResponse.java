// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyTenantUserRolesResponse setBody(ModifyTenantUserRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantUserRolesResponseBody getBody() {
        return this.body;
    }

}
