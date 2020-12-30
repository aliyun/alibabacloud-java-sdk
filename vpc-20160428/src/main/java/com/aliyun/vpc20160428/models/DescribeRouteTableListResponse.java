// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRouteTableListResponseBody body;

    public static DescribeRouteTableListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTableListResponse self = new DescribeRouteTableListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTableListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRouteTableListResponse setBody(DescribeRouteTableListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouteTableListResponseBody getBody() {
        return this.body;
    }

}
