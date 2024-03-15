// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBirthCertificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeBirthCertificationResponseBody body;

    public static RecognizeBirthCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBirthCertificationResponse self = new RecognizeBirthCertificationResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBirthCertificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBirthCertificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeBirthCertificationResponse setBody(RecognizeBirthCertificationResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBirthCertificationResponseBody getBody() {
        return this.body;
    }

}
