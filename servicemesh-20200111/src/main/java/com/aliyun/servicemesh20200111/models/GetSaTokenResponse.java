// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSaTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSaTokenResponseBody body;

    public static GetSaTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSaTokenResponse self = new GetSaTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetSaTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSaTokenResponse setBody(GetSaTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSaTokenResponseBody getBody() {
        return this.body;
    }

}
