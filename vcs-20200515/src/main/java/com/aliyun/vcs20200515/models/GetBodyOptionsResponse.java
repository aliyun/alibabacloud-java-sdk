// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetBodyOptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBodyOptionsResponseBody body;

    public static GetBodyOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBodyOptionsResponse self = new GetBodyOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetBodyOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBodyOptionsResponse setBody(GetBodyOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBodyOptionsResponseBody getBody() {
        return this.body;
    }

}
