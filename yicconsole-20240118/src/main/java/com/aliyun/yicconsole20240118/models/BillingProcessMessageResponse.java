// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class BillingProcessMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BillingProcessMessageResponseBody body;

    public static BillingProcessMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        BillingProcessMessageResponse self = new BillingProcessMessageResponse();
        return TeaModel.build(map, self);
    }

    public BillingProcessMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BillingProcessMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BillingProcessMessageResponse setBody(BillingProcessMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public BillingProcessMessageResponseBody getBody() {
        return this.body;
    }

}
