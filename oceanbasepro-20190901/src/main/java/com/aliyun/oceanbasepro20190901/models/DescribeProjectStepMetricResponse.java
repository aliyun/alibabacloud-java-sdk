// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectStepMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProjectStepMetricResponseBody body;

    public static DescribeProjectStepMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectStepMetricResponse self = new DescribeProjectStepMetricResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectStepMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectStepMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectStepMetricResponse setBody(DescribeProjectStepMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectStepMetricResponseBody getBody() {
        return this.body;
    }

}
