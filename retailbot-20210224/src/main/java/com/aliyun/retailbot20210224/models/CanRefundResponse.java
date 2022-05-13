// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CanRefundResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CanRefundResponseBody body;

    public static CanRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        CanRefundResponse self = new CanRefundResponse();
        return TeaModel.build(map, self);
    }

    public CanRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CanRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CanRefundResponse setBody(CanRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public CanRefundResponseBody getBody() {
        return this.body;
    }

}
