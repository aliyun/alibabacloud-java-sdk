// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationGroupsResponseBody body;

    public static DescribeApplicationGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationGroupsResponse self = new DescribeApplicationGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationGroupsResponse setBody(DescribeApplicationGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationGroupsResponseBody getBody() {
        return this.body;
    }

}
