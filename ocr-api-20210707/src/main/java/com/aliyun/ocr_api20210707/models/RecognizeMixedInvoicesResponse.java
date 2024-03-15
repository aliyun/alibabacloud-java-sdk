// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMixedInvoicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeMixedInvoicesResponseBody body;

    public static RecognizeMixedInvoicesResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMixedInvoicesResponse self = new RecognizeMixedInvoicesResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeMixedInvoicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeMixedInvoicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeMixedInvoicesResponse setBody(RecognizeMixedInvoicesResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMixedInvoicesResponseBody getBody() {
        return this.body;
    }

}
