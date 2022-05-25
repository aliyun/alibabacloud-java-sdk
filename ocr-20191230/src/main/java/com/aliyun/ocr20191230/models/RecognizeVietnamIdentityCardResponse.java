// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVietnamIdentityCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVietnamIdentityCardResponseBody body;

    public static RecognizeVietnamIdentityCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVietnamIdentityCardResponse self = new RecognizeVietnamIdentityCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVietnamIdentityCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVietnamIdentityCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeVietnamIdentityCardResponse setBody(RecognizeVietnamIdentityCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVietnamIdentityCardResponseBody getBody() {
        return this.body;
    }

}
