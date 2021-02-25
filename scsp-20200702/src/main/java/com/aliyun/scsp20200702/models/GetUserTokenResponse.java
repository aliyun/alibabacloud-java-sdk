// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetUserTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserTokenResponseBody body;

    public static GetUserTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenResponse self = new GetUserTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetUserTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserTokenResponse setBody(GetUserTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserTokenResponseBody getBody() {
        return this.body;
    }

}
