// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTollInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeTollInvoiceResponseBody body;

    public static RecognizeTollInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTollInvoiceResponse self = new RecognizeTollInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTollInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTollInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeTollInvoiceResponse setBody(RecognizeTollInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTollInvoiceResponseBody getBody() {
        return this.body;
    }

}
