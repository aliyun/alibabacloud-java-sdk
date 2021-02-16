// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBNodesResponseBody body;

    public static DeleteDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBNodesResponse self = new DeleteDBNodesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBNodesResponse setBody(DeleteDBNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBNodesResponseBody getBody() {
        return this.body;
    }

}
