// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBNodesResponseBody body;

    public static CreateDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBNodesResponse self = new CreateDBNodesResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBNodesResponse setBody(CreateDBNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBNodesResponseBody getBody() {
        return this.body;
    }

}
