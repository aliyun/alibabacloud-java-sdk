// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantDescriptionResponseBody body;

    public static ModifyTenantDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantDescriptionResponse self = new ModifyTenantDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantDescriptionResponse setBody(ModifyTenantDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantDescriptionResponseBody getBody() {
        return this.body;
    }

}
