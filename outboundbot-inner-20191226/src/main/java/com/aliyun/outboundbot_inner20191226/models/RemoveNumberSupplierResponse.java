// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class RemoveNumberSupplierResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveNumberSupplierResponseBody body;

    public static RemoveNumberSupplierResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveNumberSupplierResponse self = new RemoveNumberSupplierResponse();
        return TeaModel.build(map, self);
    }

    public RemoveNumberSupplierResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveNumberSupplierResponse setBody(RemoveNumberSupplierResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveNumberSupplierResponseBody getBody() {
        return this.body;
    }

}
