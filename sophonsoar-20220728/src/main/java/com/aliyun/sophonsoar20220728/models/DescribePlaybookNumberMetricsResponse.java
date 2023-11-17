// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookNumberMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlaybookNumberMetricsResponseBody body;

    public static DescribePlaybookNumberMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookNumberMetricsResponse self = new DescribePlaybookNumberMetricsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookNumberMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlaybookNumberMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlaybookNumberMetricsResponse setBody(DescribePlaybookNumberMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlaybookNumberMetricsResponseBody getBody() {
        return this.body;
    }

}
