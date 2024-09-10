// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeChartDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChartDataResponseBody body;

    public static DescribeChartDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChartDataResponse self = new DescribeChartDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChartDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChartDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChartDataResponse setBody(DescribeChartDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChartDataResponseBody getBody() {
        return this.body;
    }

}
