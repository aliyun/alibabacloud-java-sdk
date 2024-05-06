// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterDescResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyClusterDescResponseBody body;

    public static ModifyClusterDescResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDescResponse self = new ModifyClusterDescResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDescResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClusterDescResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClusterDescResponse setBody(ModifyClusterDescResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClusterDescResponseBody getBody() {
        return this.body;
    }

}
