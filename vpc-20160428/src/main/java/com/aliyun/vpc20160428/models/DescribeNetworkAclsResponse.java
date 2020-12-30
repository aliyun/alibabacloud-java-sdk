// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeNetworkAclsResponse setBody(DescribeNetworkAclsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkAclsResponseBody getBody() {
        return this.body;
    }

}
