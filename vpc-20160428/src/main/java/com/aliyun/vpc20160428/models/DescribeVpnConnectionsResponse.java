// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVpnConnectionsResponse setBody(DescribeVpnConnectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnConnectionsResponseBody getBody() {
        return this.body;
    }

}
