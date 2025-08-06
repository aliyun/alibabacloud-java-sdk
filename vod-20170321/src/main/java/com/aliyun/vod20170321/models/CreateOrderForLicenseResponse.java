// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateOrderForLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOrderForLicenseResponseBody body;

    public static CreateOrderForLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderForLicenseResponse self = new CreateOrderForLicenseResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderForLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderForLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOrderForLicenseResponse setBody(CreateOrderForLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderForLicenseResponseBody getBody() {
        return this.body;
    }

}
