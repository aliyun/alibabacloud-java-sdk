// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateMultiOrderForLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMultiOrderForLicenseResponseBody body;

    public static CreateMultiOrderForLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiOrderForLicenseResponse self = new CreateMultiOrderForLicenseResponse();
        return TeaModel.build(map, self);
    }

    public CreateMultiOrderForLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMultiOrderForLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMultiOrderForLicenseResponse setBody(CreateMultiOrderForLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMultiOrderForLicenseResponseBody getBody() {
        return this.body;
    }

}
