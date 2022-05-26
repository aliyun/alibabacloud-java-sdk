// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeNamespaceScopeSidecarConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNamespaceScopeSidecarConfigResponseBody body;

    public static DescribeNamespaceScopeSidecarConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceScopeSidecarConfigResponse self = new DescribeNamespaceScopeSidecarConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceScopeSidecarConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespaceScopeSidecarConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNamespaceScopeSidecarConfigResponse setBody(DescribeNamespaceScopeSidecarConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNamespaceScopeSidecarConfigResponseBody getBody() {
        return this.body;
    }

}
