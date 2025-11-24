// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMeshMultiClusterNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeshMultiClusterNetworkResponseBody body;

    public static DescribeMeshMultiClusterNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeshMultiClusterNetworkResponse self = new DescribeMeshMultiClusterNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeshMultiClusterNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeshMultiClusterNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeshMultiClusterNetworkResponse setBody(DescribeMeshMultiClusterNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeshMultiClusterNetworkResponseBody getBody() {
        return this.body;
    }

}
