// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeParameterGroupsResponseBody body;

    public static DescribeParameterGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupsResponse self = new DescribeParameterGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterGroupsResponse setBody(DescribeParameterGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterGroupsResponseBody getBody() {
        return this.body;
    }

}
