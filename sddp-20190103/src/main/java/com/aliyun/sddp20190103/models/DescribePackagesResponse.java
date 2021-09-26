// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribePackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePackagesResponseBody body;

    public static DescribePackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackagesResponse self = new DescribePackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePackagesResponse setBody(DescribePackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePackagesResponseBody getBody() {
        return this.body;
    }

}
