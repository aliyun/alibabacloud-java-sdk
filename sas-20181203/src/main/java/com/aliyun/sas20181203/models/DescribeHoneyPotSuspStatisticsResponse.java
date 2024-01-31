// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHoneyPotSuspStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHoneyPotSuspStatisticsResponseBody body;

    public static DescribeHoneyPotSuspStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHoneyPotSuspStatisticsResponse self = new DescribeHoneyPotSuspStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHoneyPotSuspStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHoneyPotSuspStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHoneyPotSuspStatisticsResponse setBody(DescribeHoneyPotSuspStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHoneyPotSuspStatisticsResponseBody getBody() {
        return this.body;
    }

}
