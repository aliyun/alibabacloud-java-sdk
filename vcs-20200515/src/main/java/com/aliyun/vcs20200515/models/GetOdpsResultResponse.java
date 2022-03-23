// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetOdpsResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOdpsResultResponseBody body;

    public static GetOdpsResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOdpsResultResponse self = new GetOdpsResultResponse();
        return TeaModel.build(map, self);
    }

    public GetOdpsResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOdpsResultResponse setBody(GetOdpsResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOdpsResultResponseBody getBody() {
        return this.body;
    }

}
