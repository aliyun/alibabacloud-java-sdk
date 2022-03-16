// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshClustersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshClustersResponseBody body;

    public static DescribeServiceMeshClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshClustersResponse self = new DescribeServiceMeshClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshClustersResponse setBody(DescribeServiceMeshClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshClustersResponseBody getBody() {
        return this.body;
    }

}
