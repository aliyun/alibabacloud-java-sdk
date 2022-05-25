// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeIdentityCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeIdentityCardResponseBody body;

    public static RecognizeIdentityCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIdentityCardResponse self = new RecognizeIdentityCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeIdentityCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeIdentityCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeIdentityCardResponse setBody(RecognizeIdentityCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeIdentityCardResponseBody getBody() {
        return this.body;
    }

}
