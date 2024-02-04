// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SwitchOverGlobalDatabaseNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchOverGlobalDatabaseNetworkResponseBody body;

    public static SwitchOverGlobalDatabaseNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchOverGlobalDatabaseNetworkResponse self = new SwitchOverGlobalDatabaseNetworkResponse();
        return TeaModel.build(map, self);
    }

    public SwitchOverGlobalDatabaseNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchOverGlobalDatabaseNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchOverGlobalDatabaseNetworkResponse setBody(SwitchOverGlobalDatabaseNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchOverGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

}
