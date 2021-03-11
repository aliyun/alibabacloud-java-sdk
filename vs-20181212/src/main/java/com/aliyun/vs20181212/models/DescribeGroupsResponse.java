// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeGroupsResponse setBody(DescribeGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupsResponseBody getBody() {
        return this.body;
    }

}
