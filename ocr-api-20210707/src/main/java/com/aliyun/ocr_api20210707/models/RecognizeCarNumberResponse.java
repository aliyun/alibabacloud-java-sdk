// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCarNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeCarNumberResponseBody body;

    public static RecognizeCarNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCarNumberResponse self = new RecognizeCarNumberResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCarNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeCarNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeCarNumberResponse setBody(RecognizeCarNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCarNumberResponseBody getBody() {
        return this.body;
    }

}
