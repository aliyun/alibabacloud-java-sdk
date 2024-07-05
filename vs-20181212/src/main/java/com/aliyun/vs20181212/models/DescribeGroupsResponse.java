// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupsResponseBody body;

    public static DescribeGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupsResponse self = new DescribeGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupsResponse setBody(DescribeGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupsResponseBody getBody() {
        return this.body;
    }

}
