// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class RecognizeMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeMessageResponseBody body;

    public static RecognizeMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMessageResponse self = new RecognizeMessageResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeMessageResponse setBody(RecognizeMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMessageResponseBody getBody() {
        return this.body;
    }

}
