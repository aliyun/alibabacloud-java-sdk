// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCommonPrintedInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeCommonPrintedInvoiceResponseBody body;

    public static RecognizeCommonPrintedInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCommonPrintedInvoiceResponse self = new RecognizeCommonPrintedInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCommonPrintedInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeCommonPrintedInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeCommonPrintedInvoiceResponse setBody(RecognizeCommonPrintedInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCommonPrintedInvoiceResponseBody getBody() {
        return this.body;
    }

}
