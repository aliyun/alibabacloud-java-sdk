// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBusinessLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
