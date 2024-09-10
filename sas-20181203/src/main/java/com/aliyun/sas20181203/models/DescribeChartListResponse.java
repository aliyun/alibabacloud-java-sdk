// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeChartListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChartListResponseBody body;

    public static DescribeChartListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChartListResponse self = new DescribeChartListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChartListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChartListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChartListResponse setBody(DescribeChartListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChartListResponseBody getBody() {
        return this.body;
    }

}
