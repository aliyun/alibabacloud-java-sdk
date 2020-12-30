// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class GetAsyncPredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAsyncPredictResponseBody body;

    public static GetAsyncPredictResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncPredictResponse self = new GetAsyncPredictResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncPredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncPredictResponse setBody(GetAsyncPredictResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncPredictResponseBody getBody() {
        return this.body;
    }

}
