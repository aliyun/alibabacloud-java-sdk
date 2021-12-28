// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterNamespacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGuestClusterNamespacesResponseBody body;

    public static DescribeGuestClusterNamespacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterNamespacesResponse self = new DescribeGuestClusterNamespacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterNamespacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGuestClusterNamespacesResponse setBody(DescribeGuestClusterNamespacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGuestClusterNamespacesResponseBody getBody() {
        return this.body;
    }

}
