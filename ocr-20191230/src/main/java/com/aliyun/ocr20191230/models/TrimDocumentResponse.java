// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class TrimDocumentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TrimDocumentResponseBody body;

    public static TrimDocumentResponse build(java.util.Map<String, ?> map) throws Exception {
        TrimDocumentResponse self = new TrimDocumentResponse();
        return TeaModel.build(map, self);
    }

    public TrimDocumentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrimDocumentResponse setBody(TrimDocumentResponseBody body) {
        this.body = body;
        return this;
    }
    public TrimDocumentResponseBody getBody() {
        return this.body;
    }

}
