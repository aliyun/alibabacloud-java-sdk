// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterResourceGroupResponseBody body;

    public static ModifyDBClusterResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterResourceGroupResponse self = new ModifyDBClusterResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterResourceGroupResponse setBody(ModifyDBClusterResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterResourceGroupResponseBody getBody() {
        return this.body;
    }

}
