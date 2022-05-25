// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQuotaInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeQuotaInvoiceResponseBody body;

    public static RecognizeQuotaInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQuotaInvoiceResponse self = new RecognizeQuotaInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeQuotaInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeQuotaInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeQuotaInvoiceResponse setBody(RecognizeQuotaInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeQuotaInvoiceResponseBody getBody() {
        return this.body;
    }

}
