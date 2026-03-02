// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class PatchMemoryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PatchMemoryConfigResponseBody body;

    public static PatchMemoryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PatchMemoryConfigResponse self = new PatchMemoryConfigResponse();
        return TeaModel.build(map, self);
    }

    public PatchMemoryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PatchMemoryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PatchMemoryConfigResponse setBody(PatchMemoryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PatchMemoryConfigResponseBody getBody() {
        return this.body;
    }

}
