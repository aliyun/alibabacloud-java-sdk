// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeLatinResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeLatinResponseBody body;

    public static RecognizeLatinResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLatinResponse self = new RecognizeLatinResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeLatinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeLatinResponse setBody(RecognizeLatinResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeLatinResponseBody getBody() {
        return this.body;
    }

}
