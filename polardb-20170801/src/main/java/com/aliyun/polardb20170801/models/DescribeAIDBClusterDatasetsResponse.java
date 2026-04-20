// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterDatasetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIDBClusterDatasetsResponseBody body;

    public static DescribeAIDBClusterDatasetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterDatasetsResponse self = new DescribeAIDBClusterDatasetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterDatasetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIDBClusterDatasetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIDBClusterDatasetsResponse setBody(DescribeAIDBClusterDatasetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIDBClusterDatasetsResponseBody getBody() {
        return this.body;
    }

}
