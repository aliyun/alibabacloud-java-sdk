// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEstateCertificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeEstateCertificationResponseBody body;

    public static RecognizeEstateCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEstateCertificationResponse self = new RecognizeEstateCertificationResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeEstateCertificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeEstateCertificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeEstateCertificationResponse setBody(RecognizeEstateCertificationResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEstateCertificationResponseBody getBody() {
        return this.body;
    }

}
