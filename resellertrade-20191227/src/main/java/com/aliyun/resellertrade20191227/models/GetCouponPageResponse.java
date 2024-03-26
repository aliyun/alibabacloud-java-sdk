// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetCouponPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCouponPageResponseBody body;

    public static GetCouponPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCouponPageResponse self = new GetCouponPageResponse();
        return TeaModel.build(map, self);
    }

    public GetCouponPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCouponPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCouponPageResponse setBody(GetCouponPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCouponPageResponseBody getBody() {
        return this.body;
    }

}
