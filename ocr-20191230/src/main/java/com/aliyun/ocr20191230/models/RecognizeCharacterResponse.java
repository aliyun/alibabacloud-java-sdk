// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeCharacterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeCharacterResponseBody body;

    public static RecognizeCharacterResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCharacterResponse self = new RecognizeCharacterResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCharacterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeCharacterResponse setBody(RecognizeCharacterResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCharacterResponseBody getBody() {
        return this.body;
    }

}
