// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshProxyStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshProxyStatusResponseBody body;

    public static DescribeServiceMeshProxyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshProxyStatusResponse self = new DescribeServiceMeshProxyStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshProxyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshProxyStatusResponse setBody(DescribeServiceMeshProxyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshProxyStatusResponseBody getBody() {
        return this.body;
    }

}
