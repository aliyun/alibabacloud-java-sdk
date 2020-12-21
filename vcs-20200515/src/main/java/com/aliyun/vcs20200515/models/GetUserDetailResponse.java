// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetUserDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserDetailResponseBody body;

    public static GetUserDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserDetailResponse self = new GetUserDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetUserDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserDetailResponse setBody(GetUserDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserDetailResponseBody getBody() {
        return this.body;
    }

}
