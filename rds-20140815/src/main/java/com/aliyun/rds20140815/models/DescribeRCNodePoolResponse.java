// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCNodePoolResponseBody body;

    public static DescribeRCNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCNodePoolResponse self = new DescribeRCNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCNodePoolResponse setBody(DescribeRCNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCNodePoolResponseBody getBody() {
        return this.body;
    }

}
