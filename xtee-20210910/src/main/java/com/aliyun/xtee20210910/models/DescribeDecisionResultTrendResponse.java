// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDecisionResultTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDecisionResultTrendResponseBody body;

    public static DescribeDecisionResultTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDecisionResultTrendResponse self = new DescribeDecisionResultTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDecisionResultTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDecisionResultTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDecisionResultTrendResponse setBody(DescribeDecisionResultTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDecisionResultTrendResponseBody getBody() {
        return this.body;
    }

}
