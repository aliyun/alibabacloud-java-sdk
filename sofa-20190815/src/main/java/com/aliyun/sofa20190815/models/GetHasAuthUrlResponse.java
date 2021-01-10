// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasAuthUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasAuthUrlResponseBody body;

    public static GetHasAuthUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasAuthUrlResponse self = new GetHasAuthUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetHasAuthUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasAuthUrlResponse setBody(GetHasAuthUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasAuthUrlResponseBody getBody() {
        return this.body;
    }

}
