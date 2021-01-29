// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeStampResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeStampResponseBody body;

    public static RecognizeStampResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeStampResponse self = new RecognizeStampResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeStampResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeStampResponse setBody(RecognizeStampResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeStampResponseBody getBody() {
        return this.body;
    }

}
