// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeStatisticSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStatisticSummaryResponseBody body;

    public static DescribeStatisticSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticSummaryResponse self = new DescribeStatisticSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStatisticSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStatisticSummaryResponse setBody(DescribeStatisticSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStatisticSummaryResponseBody getBody() {
        return this.body;
    }

}
