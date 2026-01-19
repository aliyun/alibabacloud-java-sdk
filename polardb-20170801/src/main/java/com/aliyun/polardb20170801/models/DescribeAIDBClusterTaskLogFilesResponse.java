// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTaskLogFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIDBClusterTaskLogFilesResponseBody body;

    public static DescribeAIDBClusterTaskLogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterTaskLogFilesResponse self = new DescribeAIDBClusterTaskLogFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterTaskLogFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIDBClusterTaskLogFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIDBClusterTaskLogFilesResponse setBody(DescribeAIDBClusterTaskLogFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIDBClusterTaskLogFilesResponseBody getBody() {
        return this.body;
    }

}
