// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeStructuredTaxiInvoicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeStructuredTaxiInvoicesResponseBody body;

    public static RecognizeStructuredTaxiInvoicesResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeStructuredTaxiInvoicesResponse self = new RecognizeStructuredTaxiInvoicesResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeStructuredTaxiInvoicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeStructuredTaxiInvoicesResponse setBody(RecognizeStructuredTaxiInvoicesResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeStructuredTaxiInvoicesResponseBody getBody() {
        return this.body;
    }

}
