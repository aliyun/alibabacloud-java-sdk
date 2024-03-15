// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCosmeticProduceLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeCosmeticProduceLicenseResponseBody body;

    public static RecognizeCosmeticProduceLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCosmeticProduceLicenseResponse self = new RecognizeCosmeticProduceLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCosmeticProduceLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeCosmeticProduceLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeCosmeticProduceLicenseResponse setBody(RecognizeCosmeticProduceLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCosmeticProduceLicenseResponseBody getBody() {
        return this.body;
    }

}
