// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMetricsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetricsDataResponseBody body;

    public static DescribeMetricsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricsDataResponse self = new DescribeMetricsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetricsDataResponse setBody(DescribeMetricsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricsDataResponseBody getBody() {
        return this.body;
    }

}
