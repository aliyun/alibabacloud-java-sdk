// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBasicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeBasicResponseBody body;

    public static RecognizeBasicResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBasicResponse self = new RecognizeBasicResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBasicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBasicResponse setBody(RecognizeBasicResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBasicResponseBody getBody() {
        return this.body;
    }

}
