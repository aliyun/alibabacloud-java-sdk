// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class DiscardCouponListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DiscardCouponListResponseBody body;

    public static DiscardCouponListResponse build(java.util.Map<String, ?> map) throws Exception {
        DiscardCouponListResponse self = new DiscardCouponListResponse();
        return TeaModel.build(map, self);
    }

    public DiscardCouponListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiscardCouponListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DiscardCouponListResponse setBody(DiscardCouponListResponseBody body) {
        this.body = body;
        return this;
    }
    public DiscardCouponListResponseBody getBody() {
        return this.body;
    }

}
