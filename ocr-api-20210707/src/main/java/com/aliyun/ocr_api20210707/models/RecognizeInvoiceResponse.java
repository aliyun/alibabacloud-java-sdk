// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeInvoiceResponseBody body;

    public static RecognizeInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeInvoiceResponse self = new RecognizeInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeInvoiceResponse setBody(RecognizeInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeInvoiceResponseBody getBody() {
        return this.body;
    }

}
