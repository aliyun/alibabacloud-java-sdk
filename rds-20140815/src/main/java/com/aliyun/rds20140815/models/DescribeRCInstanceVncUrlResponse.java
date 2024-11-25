// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceVncUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCInstanceVncUrlResponseBody body;

    public static DescribeRCInstanceVncUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceVncUrlResponse self = new DescribeRCInstanceVncUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceVncUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCInstanceVncUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCInstanceVncUrlResponse setBody(DescribeRCInstanceVncUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCInstanceVncUrlResponseBody getBody() {
        return this.body;
    }

}
