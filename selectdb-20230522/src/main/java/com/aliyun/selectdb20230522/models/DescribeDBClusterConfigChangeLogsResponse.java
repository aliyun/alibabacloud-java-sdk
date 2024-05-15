// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConfigChangeLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterConfigChangeLogsResponseBody body;

    public static DescribeDBClusterConfigChangeLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConfigChangeLogsResponse self = new DescribeDBClusterConfigChangeLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConfigChangeLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterConfigChangeLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterConfigChangeLogsResponse setBody(DescribeDBClusterConfigChangeLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterConfigChangeLogsResponseBody getBody() {
        return this.body;
    }

}
