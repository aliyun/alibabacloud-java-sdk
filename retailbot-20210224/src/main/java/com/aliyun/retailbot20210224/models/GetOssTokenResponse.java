// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetOssTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssTokenResponseBody body;

    public static GetOssTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssTokenResponse self = new GetOssTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetOssTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssTokenResponse setBody(GetOssTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssTokenResponseBody getBody() {
        return this.body;
    }

}
