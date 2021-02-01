// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateVideoCoverResponseBody body;

    public static GenerateVideoCoverResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoCoverResponse self = new GenerateVideoCoverResponse();
        return TeaModel.build(map, self);
    }

    public GenerateVideoCoverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateVideoCoverResponse setBody(GenerateVideoCoverResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateVideoCoverResponseBody getBody() {
        return this.body;
    }

}
