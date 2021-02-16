// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBClusterEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBClusterEndpointResponseBody body;

    public static DeleteDBClusterEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterEndpointResponse self = new DeleteDBClusterEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBClusterEndpointResponse setBody(DeleteDBClusterEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBClusterEndpointResponseBody getBody() {
        return this.body;
    }

}
