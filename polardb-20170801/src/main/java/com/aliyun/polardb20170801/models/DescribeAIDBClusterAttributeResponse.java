// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIDBClusterAttributeResponseBody body;

    public static DescribeAIDBClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterAttributeResponse self = new DescribeAIDBClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIDBClusterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIDBClusterAttributeResponse setBody(DescribeAIDBClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIDBClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
