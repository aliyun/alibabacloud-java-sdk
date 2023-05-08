// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class SubmitIntentionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitIntentionResponseBody body;

    public static SubmitIntentionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIntentionResponse self = new SubmitIntentionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIntentionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIntentionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitIntentionResponse setBody(SubmitIntentionResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIntentionResponseBody getBody() {
        return this.body;
    }

}
