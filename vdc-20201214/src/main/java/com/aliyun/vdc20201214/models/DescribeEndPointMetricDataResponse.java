// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeEndPointMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEndPointMetricDataResponseBody body;

    public static DescribeEndPointMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndPointMetricDataResponse self = new DescribeEndPointMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEndPointMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEndPointMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEndPointMetricDataResponse setBody(DescribeEndPointMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEndPointMetricDataResponseBody getBody() {
        return this.body;
    }

}
