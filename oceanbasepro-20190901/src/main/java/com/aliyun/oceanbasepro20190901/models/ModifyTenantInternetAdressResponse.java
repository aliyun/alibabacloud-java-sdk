// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantInternetAdressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantInternetAdressResponseBody body;

    public static ModifyTenantInternetAdressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantInternetAdressResponse self = new ModifyTenantInternetAdressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantInternetAdressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantInternetAdressResponse setBody(ModifyTenantInternetAdressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantInternetAdressResponseBody getBody() {
        return this.body;
    }

}
