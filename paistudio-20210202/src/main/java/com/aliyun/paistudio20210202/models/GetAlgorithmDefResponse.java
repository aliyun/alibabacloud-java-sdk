// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlgorithmDefResponseBody body;

    public static GetAlgorithmDefResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefResponse self = new GetAlgorithmDefResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmDefResponse setBody(GetAlgorithmDefResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmDefResponseBody getBody() {
        return this.body;
    }

}
