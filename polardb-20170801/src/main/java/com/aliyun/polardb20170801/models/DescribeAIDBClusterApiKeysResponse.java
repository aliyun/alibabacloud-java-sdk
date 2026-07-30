// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIDBClusterApiKeysResponseBody body;

    public static DescribeAIDBClusterApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterApiKeysResponse self = new DescribeAIDBClusterApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIDBClusterApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIDBClusterApiKeysResponse setBody(DescribeAIDBClusterApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIDBClusterApiKeysResponseBody getBody() {
        return this.body;
    }

}
