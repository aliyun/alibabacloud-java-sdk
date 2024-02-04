// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetGlobalDatabaseNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetGlobalDatabaseNetworkResponseBody body;

    public static ResetGlobalDatabaseNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetGlobalDatabaseNetworkResponse self = new ResetGlobalDatabaseNetworkResponse();
        return TeaModel.build(map, self);
    }

    public ResetGlobalDatabaseNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetGlobalDatabaseNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetGlobalDatabaseNetworkResponse setBody(ResetGlobalDatabaseNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

}
