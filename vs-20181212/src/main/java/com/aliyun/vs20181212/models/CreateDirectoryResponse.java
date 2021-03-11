// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDirectoryResponseBody body;

    public static CreateDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDirectoryResponse self = new CreateDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDirectoryResponse setBody(CreateDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDirectoryResponseBody getBody() {
        return this.body;
    }

}
