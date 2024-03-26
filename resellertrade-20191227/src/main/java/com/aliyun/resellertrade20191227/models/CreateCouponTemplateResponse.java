// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class CreateCouponTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCouponTemplateResponseBody body;

    public static CreateCouponTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponTemplateResponse self = new CreateCouponTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateCouponTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCouponTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCouponTemplateResponse setBody(CreateCouponTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCouponTemplateResponseBody getBody() {
        return this.body;
    }

}
