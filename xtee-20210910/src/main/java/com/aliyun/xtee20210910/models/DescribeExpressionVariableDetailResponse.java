// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariableDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressionVariableDetailResponseBody body;

    public static DescribeExpressionVariableDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariableDetailResponse self = new DescribeExpressionVariableDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariableDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressionVariableDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressionVariableDetailResponse setBody(DescribeExpressionVariableDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressionVariableDetailResponseBody getBody() {
        return this.body;
    }

}
