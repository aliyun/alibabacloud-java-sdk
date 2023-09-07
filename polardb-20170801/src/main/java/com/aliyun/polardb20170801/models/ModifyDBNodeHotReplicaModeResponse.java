// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeHotReplicaModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBNodeHotReplicaModeResponseBody body;

    public static ModifyDBNodeHotReplicaModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeHotReplicaModeResponse self = new ModifyDBNodeHotReplicaModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeHotReplicaModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBNodeHotReplicaModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBNodeHotReplicaModeResponse setBody(ModifyDBNodeHotReplicaModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBNodeHotReplicaModeResponseBody getBody() {
        return this.body;
    }

}
