// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetAuthInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthInfoResponseBody body;

    public static GetAuthInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthInfoResponse self = new GetAuthInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthInfoResponse setBody(GetAuthInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthInfoResponseBody getBody() {
        return this.body;
    }

}
