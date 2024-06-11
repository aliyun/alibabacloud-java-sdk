// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulMetaCountStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulMetaCountStatisticsResponseBody body;

    public static DescribeVulMetaCountStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulMetaCountStatisticsResponse self = new DescribeVulMetaCountStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulMetaCountStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulMetaCountStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulMetaCountStatisticsResponse setBody(DescribeVulMetaCountStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulMetaCountStatisticsResponseBody getBody() {
        return this.body;
    }

}
