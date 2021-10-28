// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteStorageBundleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStorageBundleResponseBody body;

    public static DeleteStorageBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageBundleResponse self = new DeleteStorageBundleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStorageBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStorageBundleResponse setBody(DeleteStorageBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStorageBundleResponseBody getBody() {
        return this.body;
    }

}
