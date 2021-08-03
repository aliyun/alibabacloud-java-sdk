// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTrainInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeTrainInvoiceResponseBody body;

    public static RecognizeTrainInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTrainInvoiceResponse self = new RecognizeTrainInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTrainInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTrainInvoiceResponse setBody(RecognizeTrainInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTrainInvoiceResponseBody getBody() {
        return this.body;
    }

}
