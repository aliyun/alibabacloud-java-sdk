// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAllTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeAllTextResponseBody body;

    public static RecognizeAllTextResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAllTextResponse self = new RecognizeAllTextResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeAllTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeAllTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeAllTextResponse setBody(RecognizeAllTextResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeAllTextResponseBody getBody() {
        return this.body;
    }

}
