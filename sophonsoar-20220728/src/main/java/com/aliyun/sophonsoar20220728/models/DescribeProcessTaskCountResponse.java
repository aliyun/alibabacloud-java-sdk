// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTaskCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProcessTaskCountResponseBody body;

    public static DescribeProcessTaskCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessTaskCountResponse self = new DescribeProcessTaskCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProcessTaskCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProcessTaskCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProcessTaskCountResponse setBody(DescribeProcessTaskCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProcessTaskCountResponseBody getBody() {
        return this.body;
    }

}
