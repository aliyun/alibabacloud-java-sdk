// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTravelCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeTravelCardResponseBody body;

    public static RecognizeTravelCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTravelCardResponse self = new RecognizeTravelCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTravelCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTravelCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeTravelCardResponse setBody(RecognizeTravelCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTravelCardResponseBody getBody() {
        return this.body;
    }

}
