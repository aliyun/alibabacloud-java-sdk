// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNodeGroupsResponseBody body;

    public static DescribeNodeGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeGroupsResponse self = new DescribeNodeGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodeGroupsResponse setBody(DescribeNodeGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeGroupsResponseBody getBody() {
        return this.body;
    }

}
