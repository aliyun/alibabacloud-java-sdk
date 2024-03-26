// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class SendCouponResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendCouponResponseBody body;

    public static SendCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCouponResponse self = new SendCouponResponse();
        return TeaModel.build(map, self);
    }

    public SendCouponResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCouponResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCouponResponse setBody(SendCouponResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCouponResponseBody getBody() {
        return this.body;
    }

}
