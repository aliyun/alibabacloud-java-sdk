// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeGuestClusterPodsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGuestClusterPodsResponseBody body;

    public static DescribeGuestClusterPodsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestClusterPodsResponse self = new DescribeGuestClusterPodsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGuestClusterPodsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGuestClusterPodsResponse setBody(DescribeGuestClusterPodsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGuestClusterPodsResponseBody getBody() {
        return this.body;
    }

}
