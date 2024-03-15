// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeUsedCarInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeUsedCarInvoiceResponseBody body;

    public static RecognizeUsedCarInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeUsedCarInvoiceResponse self = new RecognizeUsedCarInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeUsedCarInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeUsedCarInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeUsedCarInvoiceResponse setBody(RecognizeUsedCarInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeUsedCarInvoiceResponseBody getBody() {
        return this.body;
    }

}
