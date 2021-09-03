// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ExportSmsReceiptToOSSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportSmsReceiptToOSSResponseBody body;

    public static ExportSmsReceiptToOSSResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportSmsReceiptToOSSResponse self = new ExportSmsReceiptToOSSResponse();
        return TeaModel.build(map, self);
    }

    public ExportSmsReceiptToOSSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportSmsReceiptToOSSResponse setBody(ExportSmsReceiptToOSSResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportSmsReceiptToOSSResponseBody getBody() {
        return this.body;
    }

}
