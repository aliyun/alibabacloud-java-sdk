// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCMetricListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCMetricListResponseBody body;

    public static DescribeRCMetricListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCMetricListResponse self = new DescribeRCMetricListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCMetricListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCMetricListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCMetricListResponse setBody(DescribeRCMetricListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCMetricListResponseBody getBody() {
        return this.body;
    }

}
