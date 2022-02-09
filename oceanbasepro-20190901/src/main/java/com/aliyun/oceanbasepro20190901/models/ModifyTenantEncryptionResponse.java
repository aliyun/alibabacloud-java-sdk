// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantEncryptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantEncryptionResponseBody body;

    public static ModifyTenantEncryptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantEncryptionResponse self = new ModifyTenantEncryptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantEncryptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantEncryptionResponse setBody(ModifyTenantEncryptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantEncryptionResponseBody getBody() {
        return this.body;
    }

}
