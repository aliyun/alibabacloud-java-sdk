// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizePaymentRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizePaymentRecordResponseBody body;

    public static RecognizePaymentRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePaymentRecordResponse self = new RecognizePaymentRecordResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePaymentRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizePaymentRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizePaymentRecordResponse setBody(RecognizePaymentRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizePaymentRecordResponseBody getBody() {
        return this.body;
    }

}
