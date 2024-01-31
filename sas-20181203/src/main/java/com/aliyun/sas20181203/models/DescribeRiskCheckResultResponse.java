// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRiskCheckResultResponseBody body;

    public static DescribeRiskCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskCheckResultResponse self = new DescribeRiskCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRiskCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRiskCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRiskCheckResultResponse setBody(DescribeRiskCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRiskCheckResultResponseBody getBody() {
        return this.body;
    }

}
