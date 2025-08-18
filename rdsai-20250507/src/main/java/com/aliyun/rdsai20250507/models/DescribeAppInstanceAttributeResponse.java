// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeAppInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppInstanceAttributeResponseBody body;

    public static DescribeAppInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInstanceAttributeResponse self = new DescribeAppInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppInstanceAttributeResponse setBody(DescribeAppInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
