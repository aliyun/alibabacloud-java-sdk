// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIDBClusterTasksResponseBody body;

    public static DescribeAIDBClusterTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterTasksResponse self = new DescribeAIDBClusterTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIDBClusterTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIDBClusterTasksResponse setBody(DescribeAIDBClusterTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIDBClusterTasksResponseBody getBody() {
        return this.body;
    }

}
