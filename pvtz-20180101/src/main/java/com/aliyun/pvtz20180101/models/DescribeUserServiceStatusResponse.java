// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserServiceStatusResponseBody body;

    public static DescribeUserServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserServiceStatusResponse self = new DescribeUserServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserServiceStatusResponse setBody(DescribeUserServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserServiceStatusResponseBody getBody() {
        return this.body;
    }

}
