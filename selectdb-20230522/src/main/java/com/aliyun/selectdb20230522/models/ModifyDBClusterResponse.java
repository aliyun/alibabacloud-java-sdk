// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterResponseBody body;

    public static ModifyDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResponse self = new ModifyDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterResponse setBody(ModifyDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterResponseBody getBody() {
        return this.body;
    }

}
