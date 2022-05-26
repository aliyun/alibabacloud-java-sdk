// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshesResponseBody body;

    public static DescribeServiceMeshesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshesResponse self = new DescribeServiceMeshesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceMeshesResponse setBody(DescribeServiceMeshesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshesResponseBody getBody() {
        return this.body;
    }

}
