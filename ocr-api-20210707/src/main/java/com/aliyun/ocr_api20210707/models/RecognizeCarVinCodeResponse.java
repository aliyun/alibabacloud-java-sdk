// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCarVinCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeCarVinCodeResponseBody body;

    public static RecognizeCarVinCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCarVinCodeResponse self = new RecognizeCarVinCodeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCarVinCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeCarVinCodeResponse setBody(RecognizeCarVinCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCarVinCodeResponseBody getBody() {
        return this.body;
    }

}
