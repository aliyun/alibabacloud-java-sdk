// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnPbrRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpnPbrRouteEntriesResponseBody body;

    public static DescribeVpnPbrRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnPbrRouteEntriesResponse self = new DescribeVpnPbrRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnPbrRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnPbrRouteEntriesResponse setBody(DescribeVpnPbrRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnPbrRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
