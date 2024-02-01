// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVcoRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVcoRouteEntriesResponseBody body;

    public static DescribeVcoRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVcoRouteEntriesResponse self = new DescribeVcoRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVcoRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVcoRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVcoRouteEntriesResponse setBody(DescribeVcoRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVcoRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
