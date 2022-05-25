// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeBusinessLicenseResponseBody body;

    public static RecognizeBusinessLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessLicenseResponse self = new RecognizeBusinessLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBusinessLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeBusinessLicenseResponse setBody(RecognizeBusinessLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBusinessLicenseResponseBody getBody() {
        return this.body;
    }

}
