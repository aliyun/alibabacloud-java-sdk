// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterTaskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIDBClusterTaskAttributeResponseBody body;

    public static DescribeAIDBClusterTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterTaskAttributeResponse self = new DescribeAIDBClusterTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterTaskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIDBClusterTaskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIDBClusterTaskAttributeResponse setBody(DescribeAIDBClusterTaskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIDBClusterTaskAttributeResponseBody getBody() {
        return this.body;
    }

}
