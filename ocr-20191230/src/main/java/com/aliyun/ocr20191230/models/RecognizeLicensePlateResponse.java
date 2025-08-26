// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeLicensePlateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeLicensePlateResponseBody body;

    public static RecognizeLicensePlateResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLicensePlateResponse self = new RecognizeLicensePlateResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeLicensePlateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeLicensePlateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeLicensePlateResponse setBody(RecognizeLicensePlateResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeLicensePlateResponseBody getBody() {
        return this.body;
    }

}
