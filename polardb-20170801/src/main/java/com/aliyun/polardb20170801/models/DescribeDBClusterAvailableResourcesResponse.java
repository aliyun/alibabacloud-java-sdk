// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAvailableResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterAvailableResourcesResponseBody body;

    public static DescribeDBClusterAvailableResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAvailableResourcesResponse self = new DescribeDBClusterAvailableResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAvailableResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterAvailableResourcesResponse setBody(DescribeDBClusterAvailableResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAvailableResourcesResponseBody getBody() {
        return this.body;
    }

}
