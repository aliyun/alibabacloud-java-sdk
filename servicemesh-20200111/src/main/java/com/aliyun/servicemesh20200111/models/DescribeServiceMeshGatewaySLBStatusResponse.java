// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshGatewaySLBStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshGatewaySLBStatusResponseBody body;

    public static DescribeServiceMeshGatewaySLBStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshGatewaySLBStatusResponse self = new DescribeServiceMeshGatewaySLBStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshGatewaySLBStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshGatewaySLBStatusResponse setBody(DescribeServiceMeshGatewaySLBStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshGatewaySLBStatusResponseBody getBody() {
        return this.body;
    }

}
