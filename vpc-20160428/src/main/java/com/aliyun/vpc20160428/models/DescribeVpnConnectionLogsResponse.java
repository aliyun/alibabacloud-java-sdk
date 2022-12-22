// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpnConnectionLogsResponseBody body;

    public static DescribeVpnConnectionLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionLogsResponse self = new DescribeVpnConnectionLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnConnectionLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnConnectionLogsResponse setBody(DescribeVpnConnectionLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnConnectionLogsResponseBody getBody() {
        return this.body;
    }

}
