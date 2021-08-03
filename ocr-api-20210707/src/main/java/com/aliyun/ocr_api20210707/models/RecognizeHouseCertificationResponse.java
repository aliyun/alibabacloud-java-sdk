// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHouseCertificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeHouseCertificationResponseBody body;

    public static RecognizeHouseCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHouseCertificationResponse self = new RecognizeHouseCertificationResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeHouseCertificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeHouseCertificationResponse setBody(RecognizeHouseCertificationResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeHouseCertificationResponseBody getBody() {
        return this.body;
    }

}
