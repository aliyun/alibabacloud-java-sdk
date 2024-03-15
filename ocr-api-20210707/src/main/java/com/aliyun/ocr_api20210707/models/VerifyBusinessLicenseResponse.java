// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class VerifyBusinessLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyBusinessLicenseResponseBody body;

    public static VerifyBusinessLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyBusinessLicenseResponse self = new VerifyBusinessLicenseResponse();
        return TeaModel.build(map, self);
    }

    public VerifyBusinessLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyBusinessLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyBusinessLicenseResponse setBody(VerifyBusinessLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyBusinessLicenseResponseBody getBody() {
        return this.body;
    }

}
