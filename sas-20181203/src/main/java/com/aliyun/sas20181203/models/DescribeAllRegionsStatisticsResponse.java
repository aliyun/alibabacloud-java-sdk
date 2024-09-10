// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllRegionsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllRegionsStatisticsResponseBody body;

    public static DescribeAllRegionsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllRegionsStatisticsResponse self = new DescribeAllRegionsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllRegionsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllRegionsStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllRegionsStatisticsResponse setBody(DescribeAllRegionsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllRegionsStatisticsResponseBody getBody() {
        return this.body;
    }

}
