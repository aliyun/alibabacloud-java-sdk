// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterAccessLogDashboardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGuestClusterAccessLogDashboardsResponseBody body;

    public static DescribeGuestClusterAccessLogDashboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterAccessLogDashboardsResponse self = new DescribeGuestClusterAccessLogDashboardsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterAccessLogDashboardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGuestClusterAccessLogDashboardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGuestClusterAccessLogDashboardsResponse setBody(DescribeGuestClusterAccessLogDashboardsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGuestClusterAccessLogDashboardsResponseBody getBody() {
        return this.body;
    }

}
