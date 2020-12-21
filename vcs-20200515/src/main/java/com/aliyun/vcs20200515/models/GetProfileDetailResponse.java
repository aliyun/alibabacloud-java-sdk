// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetProfileDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProfileDetailResponseBody body;

    public static GetProfileDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProfileDetailResponse self = new GetProfileDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetProfileDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProfileDetailResponse setBody(GetProfileDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProfileDetailResponseBody getBody() {
        return this.body;
    }

}
