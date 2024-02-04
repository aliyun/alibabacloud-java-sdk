// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAndNodesParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterAndNodesParametersResponseBody body;

    public static ModifyDBClusterAndNodesParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAndNodesParametersResponse self = new ModifyDBClusterAndNodesParametersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAndNodesParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterAndNodesParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterAndNodesParametersResponse setBody(ModifyDBClusterAndNodesParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterAndNodesParametersResponseBody getBody() {
        return this.body;
    }

}
