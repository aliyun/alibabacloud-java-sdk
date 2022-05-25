// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeIndonesiaIdentityCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeIndonesiaIdentityCardResponseBody body;

    public static RecognizeIndonesiaIdentityCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIndonesiaIdentityCardResponse self = new RecognizeIndonesiaIdentityCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeIndonesiaIdentityCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeIndonesiaIdentityCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeIndonesiaIdentityCardResponse setBody(RecognizeIndonesiaIdentityCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeIndonesiaIdentityCardResponseBody getBody() {
        return this.body;
    }

}
