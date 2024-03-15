// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeNonTaxInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeNonTaxInvoiceResponseBody body;

    public static RecognizeNonTaxInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeNonTaxInvoiceResponse self = new RecognizeNonTaxInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeNonTaxInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeNonTaxInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeNonTaxInvoiceResponse setBody(RecognizeNonTaxInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeNonTaxInvoiceResponseBody getBody() {
        return this.body;
    }

}
