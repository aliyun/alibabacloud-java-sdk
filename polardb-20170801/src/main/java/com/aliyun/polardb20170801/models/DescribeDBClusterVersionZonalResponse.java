// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterVersionZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterVersionZonalResponseBody body;

    public static DescribeDBClusterVersionZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterVersionZonalResponse self = new DescribeDBClusterVersionZonalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterVersionZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterVersionZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterVersionZonalResponse setBody(DescribeDBClusterVersionZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterVersionZonalResponseBody getBody() {
        return this.body;
    }

}
