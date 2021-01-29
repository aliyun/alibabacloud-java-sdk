// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBusinessCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeBusinessCardResponseBody body;

    public static RecognizeBusinessCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessCardResponse self = new RecognizeBusinessCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBusinessCardResponse setBody(RecognizeBusinessCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBusinessCardResponseBody getBody() {
        return this.body;
    }

}
