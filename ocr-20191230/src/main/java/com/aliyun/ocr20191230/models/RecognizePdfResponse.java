// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePdfResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizePdfResponseBody body;

    public static RecognizePdfResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePdfResponse self = new RecognizePdfResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePdfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizePdfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizePdfResponse setBody(RecognizePdfResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePdfResponseBody getBody() {
        return this.body;
    }

}
