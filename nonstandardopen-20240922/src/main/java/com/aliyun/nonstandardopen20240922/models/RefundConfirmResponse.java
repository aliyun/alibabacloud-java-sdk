// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nonstandardopen20240922.models;

import com.aliyun.tea.*;

public class RefundConfirmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundConfirmResponseBody body;

    public static RefundConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundConfirmResponse self = new RefundConfirmResponse();
        return TeaModel.build(map, self);
    }

    public RefundConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundConfirmResponse setBody(RefundConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundConfirmResponseBody getBody() {
        return this.body;
    }

}
