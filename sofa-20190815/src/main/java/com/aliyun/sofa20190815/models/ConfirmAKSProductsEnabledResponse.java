// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmAKSProductsEnabledResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmAKSProductsEnabledResponseBody body;

    public static ConfirmAKSProductsEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAKSProductsEnabledResponse self = new ConfirmAKSProductsEnabledResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAKSProductsEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAKSProductsEnabledResponse setBody(ConfirmAKSProductsEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAKSProductsEnabledResponseBody getBody() {
        return this.body;
    }

}
