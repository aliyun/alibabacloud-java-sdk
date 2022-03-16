// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshAdditionalStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshAdditionalStatusResponseBody body;

    public static DescribeServiceMeshAdditionalStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshAdditionalStatusResponse self = new DescribeServiceMeshAdditionalStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshAdditionalStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshAdditionalStatusResponse setBody(DescribeServiceMeshAdditionalStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshAdditionalStatusResponseBody getBody() {
        return this.body;
    }

}
