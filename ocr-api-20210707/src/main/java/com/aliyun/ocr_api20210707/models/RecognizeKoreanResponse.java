// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeKoreanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeKoreanResponseBody body;

    public static RecognizeKoreanResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeKoreanResponse self = new RecognizeKoreanResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeKoreanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeKoreanResponse setBody(RecognizeKoreanResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeKoreanResponseBody getBody() {
        return this.body;
    }

}
