// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeTableResponseBody body;

    public static RecognizeTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableResponse self = new RecognizeTableResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeTableResponse setBody(RecognizeTableResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTableResponseBody getBody() {
        return this.body;
    }

}
