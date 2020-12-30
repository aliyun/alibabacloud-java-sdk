// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class CreateAsyncPredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAsyncPredictResponseBody body;

    public static CreateAsyncPredictResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncPredictResponse self = new CreateAsyncPredictResponse();
        return TeaModel.build(map, self);
    }

    public CreateAsyncPredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAsyncPredictResponse setBody(CreateAsyncPredictResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAsyncPredictResponseBody getBody() {
        return this.body;
    }

}
