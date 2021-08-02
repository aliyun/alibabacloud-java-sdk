// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RefundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefundResponseBody body;

    public static RefundResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundResponse self = new RefundResponse();
        return TeaModel.build(map, self);
    }

    public RefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundResponse setBody(RefundResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundResponseBody getBody() {
        return this.body;
    }

}
