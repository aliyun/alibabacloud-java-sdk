// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshKubeconfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshKubeconfigResponseBody body;

    public static DescribeServiceMeshKubeconfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshKubeconfigResponse self = new DescribeServiceMeshKubeconfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshKubeconfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshKubeconfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceMeshKubeconfigResponse setBody(DescribeServiceMeshKubeconfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshKubeconfigResponseBody getBody() {
        return this.body;
    }

}
