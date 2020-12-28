// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeVServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVServerGroupsResponseBody body;

    public static DescribeVServerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVServerGroupsResponse self = new DescribeVServerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVServerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVServerGroupsResponse setBody(DescribeVServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVServerGroupsResponseBody getBody() {
        return this.body;
    }

}
