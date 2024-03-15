// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTaxiInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeTaxiInvoiceResponseBody body;

    public static RecognizeTaxiInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTaxiInvoiceResponse self = new RecognizeTaxiInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTaxiInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTaxiInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeTaxiInvoiceResponse setBody(RecognizeTaxiInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTaxiInvoiceResponseBody getBody() {
        return this.body;
    }

}
