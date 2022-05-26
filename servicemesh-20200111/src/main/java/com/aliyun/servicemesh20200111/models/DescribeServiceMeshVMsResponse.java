// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshVMsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshVMsResponseBody body;

    public static DescribeServiceMeshVMsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshVMsResponse self = new DescribeServiceMeshVMsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshVMsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshVMsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceMeshVMsResponse setBody(DescribeServiceMeshVMsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshVMsResponseBody getBody() {
        return this.body;
    }

}
