// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeFoodManageLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeFoodManageLicenseResponseBody body;

    public static RecognizeFoodManageLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFoodManageLicenseResponse self = new RecognizeFoodManageLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFoodManageLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeFoodManageLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeFoodManageLicenseResponse setBody(RecognizeFoodManageLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeFoodManageLicenseResponseBody getBody() {
        return this.body;
    }

}
