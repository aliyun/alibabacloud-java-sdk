// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class AddNumberSupplierResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddNumberSupplierResponseBody body;

    public static AddNumberSupplierResponse build(java.util.Map<String, ?> map) throws Exception {
        AddNumberSupplierResponse self = new AddNumberSupplierResponse();
        return TeaModel.build(map, self);
    }

    public AddNumberSupplierResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddNumberSupplierResponse setBody(AddNumberSupplierResponseBody body) {
        this.body = body;
        return this;
    }
    public AddNumberSupplierResponseBody getBody() {
        return this.body;
    }

}
