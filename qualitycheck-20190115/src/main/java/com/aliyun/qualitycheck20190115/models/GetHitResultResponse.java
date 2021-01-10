// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetHitResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHitResultResponseBody body;

    public static GetHitResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHitResultResponse self = new GetHitResultResponse();
        return TeaModel.build(map, self);
    }

    public GetHitResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHitResultResponse setBody(GetHitResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHitResultResponseBody getBody() {
        return this.body;
    }

}
