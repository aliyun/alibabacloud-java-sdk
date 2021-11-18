// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceUrlResponseBody body;

    public static GetInstanceUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUrlResponse self = new GetInstanceUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceUrlResponse setBody(GetInstanceUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceUrlResponseBody getBody() {
        return this.body;
    }

}
