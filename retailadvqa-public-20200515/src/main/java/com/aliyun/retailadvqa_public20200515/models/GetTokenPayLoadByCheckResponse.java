// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetTokenPayLoadByCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTokenPayLoadByCheckResponseBody body;

    public static GetTokenPayLoadByCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenPayLoadByCheckResponse self = new GetTokenPayLoadByCheckResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenPayLoadByCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenPayLoadByCheckResponse setBody(GetTokenPayLoadByCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenPayLoadByCheckResponseBody getBody() {
        return this.body;
    }

}
