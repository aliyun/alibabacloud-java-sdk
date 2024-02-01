// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersForPhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody body;

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersForPhysicalConnectionResponse self = new DescribeVirtualBorderRoutersForPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionResponse setBody(DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
