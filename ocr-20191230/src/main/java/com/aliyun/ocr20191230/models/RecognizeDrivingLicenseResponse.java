// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeDrivingLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeDrivingLicenseResponse setBody(RecognizeDrivingLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeDrivingLicenseResponseBody getBody() {
        return this.body;
    }

}
