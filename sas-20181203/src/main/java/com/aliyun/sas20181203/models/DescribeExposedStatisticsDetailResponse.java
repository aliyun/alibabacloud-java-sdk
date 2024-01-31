// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExposedStatisticsDetailResponseBody body;

    public static DescribeExposedStatisticsDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedStatisticsDetailResponse self = new DescribeExposedStatisticsDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExposedStatisticsDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExposedStatisticsDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExposedStatisticsDetailResponse setBody(DescribeExposedStatisticsDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExposedStatisticsDetailResponseBody getBody() {
        return this.body;
    }

}
