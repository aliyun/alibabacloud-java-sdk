// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetComputeResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetComputeResultResponseBody body;

    public static GetComputeResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeResultResponse self = new GetComputeResultResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeResultResponse setBody(GetComputeResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeResultResponseBody getBody() {
        return this.body;
    }

}
