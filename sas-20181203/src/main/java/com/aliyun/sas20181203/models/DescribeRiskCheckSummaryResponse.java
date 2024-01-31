// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskCheckSummaryResponseBody body;

    public static DescribeRiskCheckSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskCheckSummaryResponse self = new DescribeRiskCheckSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskCheckSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskCheckSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskCheckSummaryResponse setBody(DescribeRiskCheckSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskCheckSummaryResponseBody getBody() {
        return this.body;
    }

}
