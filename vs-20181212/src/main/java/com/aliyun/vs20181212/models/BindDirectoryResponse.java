// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindDirectoryResponseBody body;

    public static BindDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDirectoryResponse self = new BindDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public BindDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDirectoryResponse setBody(BindDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public BindDirectoryResponseBody getBody() {
        return this.body;
    }

}
