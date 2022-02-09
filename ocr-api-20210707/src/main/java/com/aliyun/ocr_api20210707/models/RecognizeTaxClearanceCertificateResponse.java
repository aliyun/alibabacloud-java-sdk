// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTaxClearanceCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeTaxClearanceCertificateResponse setBody(RecognizeTaxClearanceCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTaxClearanceCertificateResponseBody getBody() {
        return this.body;
    }

}
