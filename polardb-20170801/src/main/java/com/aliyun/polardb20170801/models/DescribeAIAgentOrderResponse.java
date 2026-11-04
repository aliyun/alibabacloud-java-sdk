// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIAgentOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAIAgentOrderResponseBody body;

    public static DescribeAIAgentOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIAgentOrderResponse self = new DescribeAIAgentOrderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAIAgentOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAIAgentOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAIAgentOrderResponse setBody(DescribeAIAgentOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAIAgentOrderResponseBody getBody() {
        return this.body;
    }

}
