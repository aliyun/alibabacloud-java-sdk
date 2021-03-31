// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageForTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeMessageForTestResponseBody body;

    public static RecognizeMessageForTestResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageForTestResponse self = new RecognizeMessageForTestResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageForTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeMessageForTestResponse setBody(RecognizeMessageForTestResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMessageForTestResponseBody getBody() {
        return this.body;
    }

}
