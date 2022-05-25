// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeUkraineIdentityCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeUkraineIdentityCardResponseBody body;

    public static RecognizeUkraineIdentityCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeUkraineIdentityCardResponse self = new RecognizeUkraineIdentityCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeUkraineIdentityCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeUkraineIdentityCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeUkraineIdentityCardResponse setBody(RecognizeUkraineIdentityCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeUkraineIdentityCardResponseBody getBody() {
        return this.body;
    }

}
