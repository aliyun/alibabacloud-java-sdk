// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipTSActivityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SkipTSActivityInstanceResponseBody body;

    public static SkipTSActivityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipTSActivityInstanceResponse self = new SkipTSActivityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SkipTSActivityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipTSActivityInstanceResponse setBody(SkipTSActivityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipTSActivityInstanceResponseBody getBody() {
        return this.body;
    }

}
