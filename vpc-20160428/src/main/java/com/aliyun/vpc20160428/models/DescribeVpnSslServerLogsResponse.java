// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnSslServerLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpnSslServerLogsResponseBody body;

    public static DescribeVpnSslServerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnSslServerLogsResponse self = new DescribeVpnSslServerLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnSslServerLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnSslServerLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnSslServerLogsResponse setBody(DescribeVpnSslServerLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnSslServerLogsResponseBody getBody() {
        return this.body;
    }

}
