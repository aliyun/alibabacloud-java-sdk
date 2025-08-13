// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeServiceCodeNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceCodeNameResponseBody body;

    public static DescribeServiceCodeNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceCodeNameResponse self = new DescribeServiceCodeNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceCodeNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceCodeNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceCodeNameResponse setBody(DescribeServiceCodeNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceCodeNameResponseBody getBody() {
        return this.body;
    }

}
