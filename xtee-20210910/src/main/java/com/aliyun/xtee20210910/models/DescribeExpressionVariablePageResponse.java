// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariablePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpressionVariablePageResponseBody body;

    public static DescribeExpressionVariablePageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariablePageResponse self = new DescribeExpressionVariablePageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariablePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpressionVariablePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpressionVariablePageResponse setBody(DescribeExpressionVariablePageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpressionVariablePageResponseBody getBody() {
        return this.body;
    }

}
