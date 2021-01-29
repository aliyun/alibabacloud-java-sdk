// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVerificationcodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVerificationcodeResponseBody body;

    public static RecognizeVerificationcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVerificationcodeResponse self = new RecognizeVerificationcodeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVerificationcodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVerificationcodeResponse setBody(RecognizeVerificationcodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVerificationcodeResponseBody getBody() {
        return this.body;
    }

}
