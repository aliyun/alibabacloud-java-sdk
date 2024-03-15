// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeDrivingLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeDrivingLicenseResponseBody body;

    public static RecognizeDrivingLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDrivingLicenseResponse self = new RecognizeDrivingLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeDrivingLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeDrivingLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeDrivingLicenseResponse setBody(RecognizeDrivingLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeDrivingLicenseResponseBody getBody() {
        return this.body;
    }

}
