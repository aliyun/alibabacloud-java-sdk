// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifyTenantInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTenantInfoResponseBody body;

    public static ModifyTenantInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantInfoResponse self = new ModifyTenantInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTenantInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTenantInfoResponse setBody(ModifyTenantInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTenantInfoResponseBody getBody() {
        return this.body;
    }

}
