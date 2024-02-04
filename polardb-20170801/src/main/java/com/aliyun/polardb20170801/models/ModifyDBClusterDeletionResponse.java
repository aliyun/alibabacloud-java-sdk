// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDeletionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterDeletionResponseBody body;

    public static ModifyDBClusterDeletionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDeletionResponse self = new ModifyDBClusterDeletionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDeletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterDeletionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterDeletionResponse setBody(ModifyDBClusterDeletionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterDeletionResponseBody getBody() {
        return this.body;
    }

}
