// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetTokenListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTokenListResponseBody body;

    public static GetTokenListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenListResponse self = new GetTokenListResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenListResponse setBody(GetTokenListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenListResponseBody getBody() {
        return this.body;
    }

}
