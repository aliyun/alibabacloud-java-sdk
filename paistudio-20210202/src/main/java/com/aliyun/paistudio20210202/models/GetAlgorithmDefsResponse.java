// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlgorithmDefsResponseBody body;

    public static GetAlgorithmDefsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefsResponse self = new GetAlgorithmDefsResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmDefsResponse setBody(GetAlgorithmDefsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmDefsResponseBody getBody() {
        return this.body;
    }

}
