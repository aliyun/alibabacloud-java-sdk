// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGlobalDatabaseNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGlobalDatabaseNetworkResponseBody body;

    public static CreateGlobalDatabaseNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDatabaseNetworkResponse self = new CreateGlobalDatabaseNetworkResponse();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDatabaseNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGlobalDatabaseNetworkResponse setBody(CreateGlobalDatabaseNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

}
