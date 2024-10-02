// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nonstandardopen20240922.models;

import com.aliyun.tea.*;

public class RefundSubmitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundSubmitResponseBody body;

    public static RefundSubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundSubmitResponse self = new RefundSubmitResponse();
        return TeaModel.build(map, self);
    }

    public RefundSubmitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundSubmitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundSubmitResponse setBody(RefundSubmitResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundSubmitResponseBody getBody() {
        return this.body;
    }

}
