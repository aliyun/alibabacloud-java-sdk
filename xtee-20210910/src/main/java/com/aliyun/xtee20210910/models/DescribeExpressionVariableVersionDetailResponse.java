// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariableVersionDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressionVariableVersionDetailResponseBody body;

    public static DescribeExpressionVariableVersionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariableVersionDetailResponse self = new DescribeExpressionVariableVersionDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariableVersionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressionVariableVersionDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressionVariableVersionDetailResponse setBody(DescribeExpressionVariableVersionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressionVariableVersionDetailResponseBody getBody() {
        return this.body;
    }

}
