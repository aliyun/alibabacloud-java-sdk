// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizePassportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizePassportResponseBody body;

    public static RecognizePassportResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePassportResponse self = new RecognizePassportResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePassportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizePassportResponse setBody(RecognizePassportResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePassportResponseBody getBody() {
        return this.body;
    }

}
