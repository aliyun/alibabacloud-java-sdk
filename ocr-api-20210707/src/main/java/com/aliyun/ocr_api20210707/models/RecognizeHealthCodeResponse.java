// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHealthCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeHealthCodeResponseBody body;

    public static RecognizeHealthCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHealthCodeResponse self = new RecognizeHealthCodeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeHealthCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeHealthCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeHealthCodeResponse setBody(RecognizeHealthCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeHealthCodeResponseBody getBody() {
        return this.body;
    }

}
