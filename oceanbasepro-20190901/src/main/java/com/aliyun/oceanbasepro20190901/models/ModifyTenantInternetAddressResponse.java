// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantInternetAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantInternetAddressResponseBody body;

    public static ModifyTenantInternetAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantInternetAddressResponse self = new ModifyTenantInternetAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantInternetAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantInternetAddressResponse setBody(ModifyTenantInternetAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantInternetAddressResponseBody getBody() {
        return this.body;
    }

}
