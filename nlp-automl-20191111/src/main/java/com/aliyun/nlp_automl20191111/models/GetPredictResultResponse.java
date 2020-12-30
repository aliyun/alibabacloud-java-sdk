// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class GetPredictResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPredictResultResponseBody body;

    public static GetPredictResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPredictResultResponse self = new GetPredictResultResponse();
        return TeaModel.build(map, self);
    }

    public GetPredictResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPredictResultResponse setBody(GetPredictResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPredictResultResponseBody getBody() {
        return this.body;
    }

}
