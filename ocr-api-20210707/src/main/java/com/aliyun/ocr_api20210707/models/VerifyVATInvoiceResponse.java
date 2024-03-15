// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class VerifyVATInvoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyVATInvoiceResponseBody body;

    public static VerifyVATInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyVATInvoiceResponse self = new VerifyVATInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public VerifyVATInvoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyVATInvoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyVATInvoiceResponse setBody(VerifyVATInvoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyVATInvoiceResponseBody getBody() {
        return this.body;
    }

}
