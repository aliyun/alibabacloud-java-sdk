// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeWorkspaceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWorkspaceGroupsResponseBody body;

    public static DescribeWorkspaceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkspaceGroupsResponse self = new DescribeWorkspaceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWorkspaceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWorkspaceGroupsResponse setBody(DescribeWorkspaceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkspaceGroupsResponseBody getBody() {
        return this.body;
    }

}
