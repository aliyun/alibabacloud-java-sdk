// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUnitNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantUnitNumResponseBody body;

    public static ModifyTenantUnitNumResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUnitNumResponse self = new ModifyTenantUnitNumResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUnitNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantUnitNumResponse setBody(ModifyTenantUnitNumResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantUnitNumResponseBody getBody() {
        return this.body;
    }

}
