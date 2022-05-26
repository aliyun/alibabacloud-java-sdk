// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeClustersInServiceMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClustersInServiceMeshResponseBody body;

    public static DescribeClustersInServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersInServiceMeshResponse self = new DescribeClustersInServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClustersInServiceMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClustersInServiceMeshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClustersInServiceMeshResponse setBody(DescribeClustersInServiceMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClustersInServiceMeshResponseBody getBody() {
        return this.body;
    }

}
