// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalDatabaseNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyGlobalDatabaseNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGlobalDatabaseNetworkResponse setBody(ModifyGlobalDatabaseNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

}
