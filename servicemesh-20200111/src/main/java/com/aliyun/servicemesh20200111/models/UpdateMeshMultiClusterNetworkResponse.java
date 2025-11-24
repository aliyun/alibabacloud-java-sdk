// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateMeshMultiClusterNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMeshMultiClusterNetworkResponseBody body;

    public static UpdateMeshMultiClusterNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeshMultiClusterNetworkResponse self = new UpdateMeshMultiClusterNetworkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMeshMultiClusterNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMeshMultiClusterNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMeshMultiClusterNetworkResponse setBody(UpdateMeshMultiClusterNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMeshMultiClusterNetworkResponseBody getBody() {
        return this.body;
    }

}
