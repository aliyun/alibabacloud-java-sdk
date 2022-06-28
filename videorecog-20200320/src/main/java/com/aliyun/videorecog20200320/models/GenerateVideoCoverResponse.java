// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public GenerateVideoCoverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateVideoCoverResponse setBody(GenerateVideoCoverResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateVideoCoverResponseBody getBody() {
        return this.body;
    }

}
