// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantReadOnlyInternetConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantReadOnlyInternetConnectionResponseBody body;

    public static ModifyTenantReadOnlyInternetConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantReadOnlyInternetConnectionResponse self = new ModifyTenantReadOnlyInternetConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantReadOnlyInternetConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantReadOnlyInternetConnectionResponse setBody(ModifyTenantReadOnlyInternetConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantReadOnlyInternetConnectionResponseBody getBody() {
        return this.body;
    }

}
