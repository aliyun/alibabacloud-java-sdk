// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTaxClearanceCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeTaxClearanceCertificateResponseBody body;

    public static RecognizeTaxClearanceCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTaxClearanceCertificateResponse self = new RecognizeTaxClearanceCertificateResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTaxClearanceCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTaxClearanceCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeTaxClearanceCertificateResponse setBody(RecognizeTaxClearanceCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTaxClearanceCertificateResponseBody getBody() {
        return this.body;
    }

}
