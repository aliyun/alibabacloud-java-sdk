// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataAssetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataAssetsResponseBody body;

    public static DescribeDataAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAssetsResponse self = new DescribeDataAssetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataAssetsResponse setBody(DescribeDataAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataAssetsResponseBody getBody() {
        return this.body;
    }

}
