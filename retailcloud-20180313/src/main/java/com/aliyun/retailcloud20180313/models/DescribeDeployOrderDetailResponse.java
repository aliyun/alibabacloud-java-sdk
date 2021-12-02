// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeDeployOrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDeployOrderDetailResponseBody body;

    public static DescribeDeployOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployOrderDetailResponse self = new DescribeDeployOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeployOrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeployOrderDetailResponse setBody(DescribeDeployOrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeployOrderDetailResponseBody getBody() {
        return this.body;
    }

}
