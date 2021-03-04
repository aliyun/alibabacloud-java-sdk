// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

import com.aliyun.tea.*;

public class GetCallerIdentityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCallerIdentityResponseBody body;

    public static GetCallerIdentityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallerIdentityResponse self = new GetCallerIdentityResponse();
        return TeaModel.build(map, self);
    }

    public GetCallerIdentityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallerIdentityResponse setBody(GetCallerIdentityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallerIdentityResponseBody getBody() {
        return this.body;
    }

}
