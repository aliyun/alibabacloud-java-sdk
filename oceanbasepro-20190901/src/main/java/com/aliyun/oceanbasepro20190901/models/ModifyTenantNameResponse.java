// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantNameResponseBody body;

    public static ModifyTenantNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantNameResponse self = new ModifyTenantNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantNameResponse setBody(ModifyTenantNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantNameResponseBody getBody() {
        return this.body;
    }

}
