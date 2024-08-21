// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCInstanceAttributeResponseBody body;

    public static DescribeRCInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceAttributeResponse self = new DescribeRCInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCInstanceAttributeResponse setBody(DescribeRCInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
