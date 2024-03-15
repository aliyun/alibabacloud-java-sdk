// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizePassportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizePassportResponseBody body;

    public static RecognizePassportResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePassportResponse self = new RecognizePassportResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePassportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizePassportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizePassportResponse setBody(RecognizePassportResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePassportResponseBody getBody() {
        return this.body;
    }

}
