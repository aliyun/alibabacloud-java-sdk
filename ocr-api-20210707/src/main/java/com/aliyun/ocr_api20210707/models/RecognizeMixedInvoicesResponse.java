// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMixedInvoicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeMixedInvoicesResponse setBody(RecognizeMixedInvoicesResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMixedInvoicesResponseBody getBody() {
        return this.body;
    }

}
