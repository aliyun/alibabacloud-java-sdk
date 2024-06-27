// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariableFunctionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressionVariableFunctionListResponseBody body;

    public static DescribeExpressionVariableFunctionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariableFunctionListResponse self = new DescribeExpressionVariableFunctionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariableFunctionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressionVariableFunctionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressionVariableFunctionListResponse setBody(DescribeExpressionVariableFunctionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressionVariableFunctionListResponseBody getBody() {
        return this.body;
    }

}
