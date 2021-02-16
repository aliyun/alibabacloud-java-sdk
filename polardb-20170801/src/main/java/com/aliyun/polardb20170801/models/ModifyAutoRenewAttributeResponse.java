// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAutoRenewAttributeResponseBody body;

    public static ModifyAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeResponse self = new ModifyAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAutoRenewAttributeResponse setBody(ModifyAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}
