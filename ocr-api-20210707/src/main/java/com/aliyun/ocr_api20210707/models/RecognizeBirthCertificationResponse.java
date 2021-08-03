// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBirthCertificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeBirthCertificationResponse setBody(RecognizeBirthCertificationResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBirthCertificationResponseBody getBody() {
        return this.body;
    }

}
