// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterNetworkResponseBody body;

    public static DescribeClusterNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNetworkResponse self = new DescribeClusterNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterNetworkResponse setBody(DescribeClusterNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterNetworkResponseBody getBody() {
        return this.body;
    }

}
