// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVINCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVINCodeResponseBody body;

    public static RecognizeVINCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVINCodeResponse self = new RecognizeVINCodeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVINCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVINCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeVINCodeResponse setBody(RecognizeVINCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVINCodeResponseBody getBody() {
        return this.body;
    }

}
