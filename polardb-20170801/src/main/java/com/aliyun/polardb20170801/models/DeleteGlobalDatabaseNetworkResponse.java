// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteGlobalDatabaseNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGlobalDatabaseNetworkResponseBody body;

    public static DeleteGlobalDatabaseNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalDatabaseNetworkResponse self = new DeleteGlobalDatabaseNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalDatabaseNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGlobalDatabaseNetworkResponse setBody(DeleteGlobalDatabaseNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

}
