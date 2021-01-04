// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnicomOrderConfirmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnicomOrderConfirmResponseBody body;

    public static UnicomOrderConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        UnicomOrderConfirmResponse self = new UnicomOrderConfirmResponse();
        return TeaModel.build(map, self);
    }

    public UnicomOrderConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnicomOrderConfirmResponse setBody(UnicomOrderConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public UnicomOrderConfirmResponseBody getBody() {
        return this.body;
    }

}
