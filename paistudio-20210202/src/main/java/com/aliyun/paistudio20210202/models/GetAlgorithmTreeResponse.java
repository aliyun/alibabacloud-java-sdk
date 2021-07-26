// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlgorithmTreeResponseBody body;

    public static GetAlgorithmTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmTreeResponse self = new GetAlgorithmTreeResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmTreeResponse setBody(GetAlgorithmTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmTreeResponseBody getBody() {
        return this.body;
    }

}
