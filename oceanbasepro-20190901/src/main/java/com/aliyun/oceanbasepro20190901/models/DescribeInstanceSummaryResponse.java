// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceSummaryResponseBody body;

    public static DescribeInstanceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSummaryResponse self = new DescribeInstanceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSummaryResponse setBody(DescribeInstanceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSummaryResponseBody getBody() {
        return this.body;
    }

}
