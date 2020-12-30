// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class GetModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelResponseBody body;

    public static GetModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelResponse self = new GetModelResponse();
        return TeaModel.build(map, self);
    }

    public GetModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelResponse setBody(GetModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelResponseBody getBody() {
        return this.body;
    }

}
