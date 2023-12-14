// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateStorageBundleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStorageBundleResponseBody body;

    public static CreateStorageBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageBundleResponse self = new CreateStorageBundleResponse();
        return TeaModel.build(map, self);
    }

    public CreateStorageBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStorageBundleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStorageBundleResponse setBody(CreateStorageBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStorageBundleResponseBody getBody() {
        return this.body;
    }

}
