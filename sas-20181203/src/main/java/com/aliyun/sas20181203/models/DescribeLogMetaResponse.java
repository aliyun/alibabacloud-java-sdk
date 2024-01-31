// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogMetaResponseBody body;

    public static DescribeLogMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMetaResponse self = new DescribeLogMetaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogMetaResponse setBody(DescribeLogMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogMetaResponseBody getBody() {
        return this.body;
    }

}
