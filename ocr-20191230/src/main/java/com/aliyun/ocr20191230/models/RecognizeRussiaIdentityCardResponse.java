// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeRussiaIdentityCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeRussiaIdentityCardResponseBody body;

    public static RecognizeRussiaIdentityCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRussiaIdentityCardResponse self = new RecognizeRussiaIdentityCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeRussiaIdentityCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeRussiaIdentityCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeRussiaIdentityCardResponse setBody(RecognizeRussiaIdentityCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeRussiaIdentityCardResponseBody getBody() {
        return this.body;
    }

}
