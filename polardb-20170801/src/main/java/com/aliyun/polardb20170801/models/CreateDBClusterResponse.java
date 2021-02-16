// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBClusterResponseBody body;

    public static CreateDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterResponse self = new CreateDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBClusterResponse setBody(CreateDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBClusterResponseBody getBody() {
        return this.body;
    }

}
