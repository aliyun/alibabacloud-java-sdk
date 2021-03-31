// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetUserAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserAuthorizationResponseBody body;

    public static GetUserAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserAuthorizationResponse self = new GetUserAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public GetUserAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserAuthorizationResponse setBody(GetUserAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserAuthorizationResponseBody getBody() {
        return this.body;
    }

}
