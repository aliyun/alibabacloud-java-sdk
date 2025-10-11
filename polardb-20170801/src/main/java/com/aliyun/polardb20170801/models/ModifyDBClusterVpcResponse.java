// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterVpcResponseBody body;

    public static ModifyDBClusterVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterVpcResponse self = new ModifyDBClusterVpcResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterVpcResponse setBody(ModifyDBClusterVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterVpcResponseBody getBody() {
        return this.body;
    }

}
