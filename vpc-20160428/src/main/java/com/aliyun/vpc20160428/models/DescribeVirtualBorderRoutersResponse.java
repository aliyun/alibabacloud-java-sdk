// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVirtualBorderRoutersResponseBody body;

    public static DescribeVirtualBorderRoutersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersResponse self = new DescribeVirtualBorderRoutersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualBorderRoutersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVirtualBorderRoutersResponse setBody(DescribeVirtualBorderRoutersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualBorderRoutersResponseBody getBody() {
        return this.body;
    }

}
