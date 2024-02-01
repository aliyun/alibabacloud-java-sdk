// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpnConnectionResponseBody body;

    public static DescribeVpnConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionResponse self = new DescribeVpnConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnConnectionResponse setBody(DescribeVpnConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnConnectionResponseBody getBody() {
        return this.body;
    }

}
