// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBatchRecognizeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeBatchRecognizeResponseBody body;

    public static RecognizeBatchRecognizeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBatchRecognizeResponse self = new RecognizeBatchRecognizeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBatchRecognizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBatchRecognizeResponse setBody(RecognizeBatchRecognizeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBatchRecognizeResponseBody getBody() {
        return this.body;
    }

}
