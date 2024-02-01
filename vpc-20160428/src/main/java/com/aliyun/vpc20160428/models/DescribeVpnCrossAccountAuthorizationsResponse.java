// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnCrossAccountAuthorizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpnCrossAccountAuthorizationsResponseBody body;

    public static DescribeVpnCrossAccountAuthorizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnCrossAccountAuthorizationsResponse self = new DescribeVpnCrossAccountAuthorizationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnCrossAccountAuthorizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnCrossAccountAuthorizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnCrossAccountAuthorizationsResponse setBody(DescribeVpnCrossAccountAuthorizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnCrossAccountAuthorizationsResponseBody getBody() {
        return this.body;
    }

}
