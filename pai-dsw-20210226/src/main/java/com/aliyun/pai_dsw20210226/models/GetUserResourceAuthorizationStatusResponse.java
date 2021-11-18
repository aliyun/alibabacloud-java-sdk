// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserResourceAuthorizationStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserResourceAuthorizationStatusResponseBody body;

    public static GetUserResourceAuthorizationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserResourceAuthorizationStatusResponse self = new GetUserResourceAuthorizationStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetUserResourceAuthorizationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserResourceAuthorizationStatusResponse setBody(GetUserResourceAuthorizationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserResourceAuthorizationStatusResponseBody getBody() {
        return this.body;
    }

}
