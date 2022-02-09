// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceTopologyResponseBody body;

    public static DescribeInstanceTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTopologyResponse self = new DescribeInstanceTopologyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTopologyResponse setBody(DescribeInstanceTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTopologyResponseBody getBody() {
        return this.body;
    }

}
