// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCarInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RecognizeCarInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeCarInvoiceResponse setBody(RecognizeCarInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCarInvoiceResponseBody getBody() {
        return this.body;
    }

}
