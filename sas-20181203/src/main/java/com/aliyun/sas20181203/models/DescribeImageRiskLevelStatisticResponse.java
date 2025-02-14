// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRiskLevelStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageRiskLevelStatisticResponseBody body;

    public static DescribeImageRiskLevelStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRiskLevelStatisticResponse self = new DescribeImageRiskLevelStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageRiskLevelStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageRiskLevelStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageRiskLevelStatisticResponse setBody(DescribeImageRiskLevelStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageRiskLevelStatisticResponseBody getBody() {
        return this.body;
    }

}
