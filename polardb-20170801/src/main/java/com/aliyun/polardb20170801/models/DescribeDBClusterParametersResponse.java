// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeDBClusterParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterParametersResponse setBody(DescribeDBClusterParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterParametersResponseBody getBody() {
        return this.body;
    }

}
