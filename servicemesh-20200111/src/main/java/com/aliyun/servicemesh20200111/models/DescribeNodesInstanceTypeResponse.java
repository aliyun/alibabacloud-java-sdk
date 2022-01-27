// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeNodesInstanceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNodesInstanceTypeResponseBody body;

    public static DescribeNodesInstanceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodesInstanceTypeResponse self = new DescribeNodesInstanceTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodesInstanceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodesInstanceTypeResponse setBody(DescribeNodesInstanceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodesInstanceTypeResponseBody getBody() {
        return this.body;
    }

}
