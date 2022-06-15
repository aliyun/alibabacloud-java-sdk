// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseBody body;

    public static DescribeInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponse self = new DescribeInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceAttributeResponse setBody(DescribeInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
