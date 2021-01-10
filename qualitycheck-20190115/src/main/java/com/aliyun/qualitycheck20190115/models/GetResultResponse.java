// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResultResponseBody body;

    public static GetResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResultResponse self = new GetResultResponse();
        return TeaModel.build(map, self);
    }

    public GetResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResultResponse setBody(GetResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResultResponseBody getBody() {
        return this.body;
    }

}
