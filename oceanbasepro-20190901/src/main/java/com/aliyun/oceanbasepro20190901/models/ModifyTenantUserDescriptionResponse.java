// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantUserDescriptionResponseBody body;

    public static ModifyTenantUserDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserDescriptionResponse self = new ModifyTenantUserDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantUserDescriptionResponse setBody(ModifyTenantUserDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantUserDescriptionResponseBody getBody() {
        return this.body;
    }

}
