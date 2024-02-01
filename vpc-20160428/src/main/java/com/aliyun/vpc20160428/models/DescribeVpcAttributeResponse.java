// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeVpcAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcAttributeResponse setBody(DescribeVpcAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcAttributeResponseBody getBody() {
        return this.body;
    }

}
