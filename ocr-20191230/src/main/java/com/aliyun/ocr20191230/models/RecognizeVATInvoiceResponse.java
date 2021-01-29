// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVATInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVATInvoiceResponseBody body;

    public static RecognizeVATInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVATInvoiceResponse self = new RecognizeVATInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVATInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVATInvoiceResponse setBody(RecognizeVATInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVATInvoiceResponseBody getBody() {
        return this.body;
    }

}
