// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalDatabaseNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGlobalDatabaseNetworkResponseBody body;

    public static ModifyGlobalDatabaseNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalDatabaseNetworkResponse self = new ModifyGlobalDatabaseNetworkResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalDatabaseNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGlobalDatabaseNetworkResponse setBody(ModifyGlobalDatabaseNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

}
