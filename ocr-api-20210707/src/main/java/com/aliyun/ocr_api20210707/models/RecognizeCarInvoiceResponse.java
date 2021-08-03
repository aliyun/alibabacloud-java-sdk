// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCarInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeCarInvoiceResponseBody body;

    public static RecognizeCarInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCarInvoiceResponse self = new RecognizeCarInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCarInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeCarInvoiceResponse setBody(RecognizeCarInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCarInvoiceResponseBody getBody() {
        return this.body;
    }

}
