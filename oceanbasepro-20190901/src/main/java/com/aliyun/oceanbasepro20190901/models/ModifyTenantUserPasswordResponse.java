// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantUserPasswordResponseBody body;

    public static ModifyTenantUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserPasswordResponse self = new ModifyTenantUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantUserPasswordResponse setBody(ModifyTenantUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantUserPasswordResponseBody getBody() {
        return this.body;
    }

}
