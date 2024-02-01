// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpnRouteEntriesResponseBody body;

    public static DescribeVpnRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnRouteEntriesResponse self = new DescribeVpnRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnRouteEntriesResponse setBody(DescribeVpnRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
