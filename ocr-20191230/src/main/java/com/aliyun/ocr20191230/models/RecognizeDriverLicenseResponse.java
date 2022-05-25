// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDriverLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeDriverLicenseResponseBody body;

    public static RecognizeDriverLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDriverLicenseResponse self = new RecognizeDriverLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeDriverLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeDriverLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeDriverLicenseResponse setBody(RecognizeDriverLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeDriverLicenseResponseBody getBody() {
        return this.body;
    }

}
