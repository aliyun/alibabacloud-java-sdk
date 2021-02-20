// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DestroyResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DestroyResourceDirectoryResponseBody body;

    public static DestroyResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyResourceDirectoryResponse self = new DestroyResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public DestroyResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestroyResourceDirectoryResponse setBody(DestroyResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
