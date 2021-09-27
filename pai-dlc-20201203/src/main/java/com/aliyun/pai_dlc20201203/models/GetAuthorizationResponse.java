// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthorizationResponseBody body;

    public static GetAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationResponse self = new GetAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationResponse setBody(GetAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationResponseBody getBody() {
        return this.body;
    }

}
