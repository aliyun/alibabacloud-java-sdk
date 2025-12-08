// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyVirtualClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVirtualClusterResponseBody body;

    public static ModifyVirtualClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualClusterResponse self = new ModifyVirtualClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVirtualClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVirtualClusterResponse setBody(ModifyVirtualClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVirtualClusterResponseBody getBody() {
        return this.body;
    }

}
