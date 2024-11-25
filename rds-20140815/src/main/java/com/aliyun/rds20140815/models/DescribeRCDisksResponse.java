// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCDisksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCDisksResponseBody body;

    public static DescribeRCDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCDisksResponse self = new DescribeRCDisksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCDisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCDisksResponse setBody(DescribeRCDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCDisksResponseBody getBody() {
        return this.body;
    }

}
