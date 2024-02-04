// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterServerlessConfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterServerlessConfResponseBody body;

    public static DescribeDBClusterServerlessConfResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterServerlessConfResponse self = new DescribeDBClusterServerlessConfResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterServerlessConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterServerlessConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterServerlessConfResponse setBody(DescribeDBClusterServerlessConfResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterServerlessConfResponseBody getBody() {
        return this.body;
    }

}
