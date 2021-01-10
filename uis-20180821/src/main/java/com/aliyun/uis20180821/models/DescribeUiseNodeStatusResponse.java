// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeUiseNodeStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUiseNodeStatusResponseBody body;

    public static DescribeUiseNodeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUiseNodeStatusResponse self = new DescribeUiseNodeStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUiseNodeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUiseNodeStatusResponse setBody(DescribeUiseNodeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUiseNodeStatusResponseBody getBody() {
        return this.body;
    }

}
