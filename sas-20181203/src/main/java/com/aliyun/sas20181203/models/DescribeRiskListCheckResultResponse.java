// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskListCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskListCheckResultResponseBody body;

    public static DescribeRiskListCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskListCheckResultResponse self = new DescribeRiskListCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskListCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskListCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskListCheckResultResponse setBody(DescribeRiskListCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskListCheckResultResponseBody getBody() {
        return this.body;
    }

}
