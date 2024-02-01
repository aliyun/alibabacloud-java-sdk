// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkAclsResponseBody body;

    public static DescribeNetworkAclsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclsResponse self = new DescribeNetworkAclsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkAclsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkAclsResponse setBody(DescribeNetworkAclsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkAclsResponseBody getBody() {
        return this.body;
    }

}
