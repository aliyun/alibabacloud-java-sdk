// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWorkspacesResponseBody body;

    public static DescribeWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkspacesResponse self = new DescribeWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWorkspacesResponse setBody(DescribeWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWorkspacesResponseBody getBody() {
        return this.body;
    }

}
