// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateGlobalDatabaseNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateGlobalDatabaseNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGlobalDatabaseNetworkResponse setBody(CreateGlobalDatabaseNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

}
