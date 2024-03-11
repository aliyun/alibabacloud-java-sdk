// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeIceDurSummaryOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIceDurSummaryOverviewResponseBody body;

    public static DescribeIceDurSummaryOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIceDurSummaryOverviewResponse self = new DescribeIceDurSummaryOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIceDurSummaryOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIceDurSummaryOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIceDurSummaryOverviewResponse setBody(DescribeIceDurSummaryOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIceDurSummaryOverviewResponseBody getBody() {
        return this.body;
    }

}
