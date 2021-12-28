// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeVMsInServiceMeshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVMsInServiceMeshResponseBody body;

    public static DescribeVMsInServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVMsInServiceMeshResponse self = new DescribeVMsInServiceMeshResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVMsInServiceMeshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVMsInServiceMeshResponse setBody(DescribeVMsInServiceMeshResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVMsInServiceMeshResponseBody getBody() {
        return this.body;
    }

}
