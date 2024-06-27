// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeApiGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApiGroupsResponseBody body;

    public static DescribeApiGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupsResponse self = new DescribeApiGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApiGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApiGroupsResponse setBody(DescribeApiGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApiGroupsResponseBody getBody() {
        return this.body;
    }

}
