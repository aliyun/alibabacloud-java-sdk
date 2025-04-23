// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifySearcherReplicaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySearcherReplicaResponseBody body;

    public static ModifySearcherReplicaResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySearcherReplicaResponse self = new ModifySearcherReplicaResponse();
        return TeaModel.build(map, self);
    }

    public ModifySearcherReplicaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySearcherReplicaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySearcherReplicaResponse setBody(ModifySearcherReplicaResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySearcherReplicaResponseBody getBody() {
        return this.body;
    }

}
