// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210907_141348762.models;

import com.aliyun.tea.*;

public class SupplierConfirmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SupplierConfirmResponseBody body;

    public static SupplierConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        SupplierConfirmResponse self = new SupplierConfirmResponse();
        return TeaModel.build(map, self);
    }

    public SupplierConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SupplierConfirmResponse setBody(SupplierConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public SupplierConfirmResponseBody getBody() {
        return this.body;
    }

}
