// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceMeshDetailResponseBody body;

    public static DescribeServiceMeshDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshDetailResponse self = new DescribeServiceMeshDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceMeshDetailResponse setBody(DescribeServiceMeshDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceMeshDetailResponseBody getBody() {
        return this.body;
    }

}
