// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpcAttributeResponseBody body;

    public static DescribeVpcAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAttributeResponse self = new DescribeVpcAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcAttributeResponse setBody(DescribeVpcAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcAttributeResponseBody getBody() {
        return this.body;
    }

}
