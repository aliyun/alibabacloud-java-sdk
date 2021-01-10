// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipDWSOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipDWSOrderResponseBody body;

    public static SkipDWSOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipDWSOrderResponse self = new SkipDWSOrderResponse();
        return TeaModel.build(map, self);
    }

    public SkipDWSOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipDWSOrderResponse setBody(SkipDWSOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipDWSOrderResponseBody getBody() {
        return this.body;
    }

}
