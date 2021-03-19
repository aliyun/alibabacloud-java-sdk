// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class ModifyNumberSupplierResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNumberSupplierResponseBody body;

    public static ModifyNumberSupplierResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNumberSupplierResponse self = new ModifyNumberSupplierResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNumberSupplierResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNumberSupplierResponse setBody(ModifyNumberSupplierResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNumberSupplierResponseBody getBody() {
        return this.body;
    }

}
