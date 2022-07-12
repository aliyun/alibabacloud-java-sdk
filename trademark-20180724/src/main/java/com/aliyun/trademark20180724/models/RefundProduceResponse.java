// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RefundProduceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefundProduceResponseBody body;

    public static RefundProduceResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundProduceResponse self = new RefundProduceResponse();
        return TeaModel.build(map, self);
    }

    public RefundProduceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundProduceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundProduceResponse setBody(RefundProduceResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundProduceResponseBody getBody() {
        return this.body;
    }

}
