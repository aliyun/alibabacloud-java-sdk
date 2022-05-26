// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshUpgradeStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshUpgradeStatusResponseBody body;

    public static DescribeServiceMeshUpgradeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshUpgradeStatusResponse self = new DescribeServiceMeshUpgradeStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshUpgradeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshUpgradeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceMeshUpgradeStatusResponse setBody(DescribeServiceMeshUpgradeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshUpgradeStatusResponseBody getBody() {
        return this.body;
    }

}
