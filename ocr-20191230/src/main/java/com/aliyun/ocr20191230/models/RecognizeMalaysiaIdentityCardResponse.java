// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeMalaysiaIdentityCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeMalaysiaIdentityCardResponseBody body;

    public static RecognizeMalaysiaIdentityCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMalaysiaIdentityCardResponse self = new RecognizeMalaysiaIdentityCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeMalaysiaIdentityCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeMalaysiaIdentityCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeMalaysiaIdentityCardResponse setBody(RecognizeMalaysiaIdentityCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMalaysiaIdentityCardResponseBody getBody() {
        return this.body;
    }

}
