// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeNonTaxInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeNonTaxInvoiceResponse setBody(RecognizeNonTaxInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeNonTaxInvoiceResponseBody getBody() {
        return this.body;
    }

}
