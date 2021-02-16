// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBClusterParametersResponseBody body;

    public static DescribeDBClusterParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterParametersResponse self = new DescribeDBClusterParametersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterParametersResponse setBody(DescribeDBClusterParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterParametersResponseBody getBody() {
        return this.body;
    }

}
