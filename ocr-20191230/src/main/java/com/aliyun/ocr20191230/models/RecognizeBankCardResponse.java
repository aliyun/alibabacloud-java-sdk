// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeBankCardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeBankCardResponseBody body;

    public static RecognizeBankCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankCardResponse self = new RecognizeBankCardResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBankCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBankCardResponse setBody(RecognizeBankCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBankCardResponseBody getBody() {
        return this.body;
    }

}
