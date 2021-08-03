// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHandwritingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeHandwritingResponseBody body;

    public static RecognizeHandwritingResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHandwritingResponse self = new RecognizeHandwritingResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeHandwritingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeHandwritingResponse setBody(RecognizeHandwritingResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeHandwritingResponseBody getBody() {
        return this.body;
    }

}
