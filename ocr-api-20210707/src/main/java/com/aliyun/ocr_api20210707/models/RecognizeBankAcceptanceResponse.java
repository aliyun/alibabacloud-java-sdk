// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBankAcceptanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeBankAcceptanceResponseBody body;

    public static RecognizeBankAcceptanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankAcceptanceResponse self = new RecognizeBankAcceptanceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBankAcceptanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBankAcceptanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeBankAcceptanceResponse setBody(RecognizeBankAcceptanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBankAcceptanceResponseBody getBody() {
        return this.body;
    }

}
