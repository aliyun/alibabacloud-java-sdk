// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeInternationalBusinessLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeInternationalBusinessLicenseResponseBody body;

    public static RecognizeInternationalBusinessLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeInternationalBusinessLicenseResponse self = new RecognizeInternationalBusinessLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeInternationalBusinessLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeInternationalBusinessLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeInternationalBusinessLicenseResponse setBody(RecognizeInternationalBusinessLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeInternationalBusinessLicenseResponseBody getBody() {
        return this.body;
    }

}
