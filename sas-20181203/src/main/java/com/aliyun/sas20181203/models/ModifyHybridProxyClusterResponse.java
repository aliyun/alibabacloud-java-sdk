// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyHybridProxyClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHybridProxyClusterResponseBody body;

    public static ModifyHybridProxyClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridProxyClusterResponse self = new ModifyHybridProxyClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHybridProxyClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHybridProxyClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHybridProxyClusterResponse setBody(ModifyHybridProxyClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHybridProxyClusterResponseBody getBody() {
        return this.body;
    }

}
