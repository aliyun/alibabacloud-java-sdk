// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNetworkAclAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkAclAttributesResponseBody body;

    public static DescribeNetworkAclAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAclAttributesResponse self = new DescribeNetworkAclAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAclAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkAclAttributesResponse setBody(DescribeNetworkAclAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkAclAttributesResponseBody getBody() {
        return this.body;
    }

}
