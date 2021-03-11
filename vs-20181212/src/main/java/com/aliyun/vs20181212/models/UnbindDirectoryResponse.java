// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindDirectoryResponseBody body;

    public static UnbindDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDirectoryResponse self = new UnbindDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDirectoryResponse setBody(UnbindDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDirectoryResponseBody getBody() {
        return this.body;
    }

}
