// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIDBClustersResponseBody body;

    public static DescribeAIDBClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClustersResponse self = new DescribeAIDBClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIDBClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIDBClustersResponse setBody(DescribeAIDBClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIDBClustersResponseBody getBody() {
        return this.body;
    }

}
