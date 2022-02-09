// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeStoragePlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeStoragePlanResponseBody body;

    public static DescribeStoragePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePlanResponse self = new DescribeStoragePlanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStoragePlanResponse setBody(DescribeStoragePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStoragePlanResponseBody getBody() {
        return this.body;
    }

}
