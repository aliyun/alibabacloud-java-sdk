// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpnConnectionsResponseBody body;

    public static DescribeVpnConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionsResponse self = new DescribeVpnConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnConnectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnConnectionsResponse setBody(DescribeVpnConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnConnectionsResponseBody getBody() {
        return this.body;
    }

}
