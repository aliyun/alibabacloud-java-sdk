// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterConfigResponseBody body;

    public static DescribeDBClusterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigResponse self = new DescribeDBClusterConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterConfigResponse setBody(DescribeDBClusterConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterConfigResponseBody getBody() {
        return this.body;
    }

}
