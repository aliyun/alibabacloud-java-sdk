// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeFoodProduceLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeFoodProduceLicenseResponseBody body;

    public static RecognizeFoodProduceLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFoodProduceLicenseResponse self = new RecognizeFoodProduceLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFoodProduceLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeFoodProduceLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeFoodProduceLicenseResponse setBody(RecognizeFoodProduceLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeFoodProduceLicenseResponseBody getBody() {
        return this.body;
    }

}
