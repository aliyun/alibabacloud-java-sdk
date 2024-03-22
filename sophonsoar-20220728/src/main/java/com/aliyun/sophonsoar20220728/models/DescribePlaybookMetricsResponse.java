// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlaybookMetricsResponseBody body;

    public static DescribePlaybookMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookMetricsResponse self = new DescribePlaybookMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlaybookMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlaybookMetricsResponse setBody(DescribePlaybookMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlaybookMetricsResponseBody getBody() {
        return this.body;
    }

}
