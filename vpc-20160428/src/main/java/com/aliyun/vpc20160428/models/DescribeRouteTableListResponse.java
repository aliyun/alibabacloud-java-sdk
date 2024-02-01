// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeRouteTableListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRouteTableListResponse setBody(DescribeRouteTableListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouteTableListResponseBody getBody() {
        return this.body;
    }

}
