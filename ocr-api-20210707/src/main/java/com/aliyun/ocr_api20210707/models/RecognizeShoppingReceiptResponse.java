// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeShoppingReceiptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeShoppingReceiptResponseBody body;

    public static RecognizeShoppingReceiptResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeShoppingReceiptResponse self = new RecognizeShoppingReceiptResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeShoppingReceiptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeShoppingReceiptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeShoppingReceiptResponse setBody(RecognizeShoppingReceiptResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeShoppingReceiptResponseBody getBody() {
        return this.body;
    }

}
