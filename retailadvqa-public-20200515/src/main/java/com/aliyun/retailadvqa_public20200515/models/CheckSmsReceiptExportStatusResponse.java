// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckSmsReceiptExportStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSmsReceiptExportStatusResponseBody body;

    public static CheckSmsReceiptExportStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsReceiptExportStatusResponse self = new CheckSmsReceiptExportStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckSmsReceiptExportStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSmsReceiptExportStatusResponse setBody(CheckSmsReceiptExportStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSmsReceiptExportStatusResponseBody getBody() {
        return this.body;
    }

}
