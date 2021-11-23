// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCharacterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVideoCharacterResponseBody body;

    public static RecognizeVideoCharacterResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCharacterResponse self = new RecognizeVideoCharacterResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCharacterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVideoCharacterResponse setBody(RecognizeVideoCharacterResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVideoCharacterResponseBody getBody() {
        return this.body;
    }

}
