// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTicketInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeTicketInvoiceResponseBody body;

    public static RecognizeTicketInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTicketInvoiceResponse self = new RecognizeTicketInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTicketInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTicketInvoiceResponse setBody(RecognizeTicketInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTicketInvoiceResponseBody getBody() {
        return this.body;
    }

}
