// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeThaiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeThaiResponseBody body;

    public static RecognizeThaiResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeThaiResponse self = new RecognizeThaiResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeThaiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeThaiResponse setBody(RecognizeThaiResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeThaiResponseBody getBody() {
        return this.body;
    }

}
