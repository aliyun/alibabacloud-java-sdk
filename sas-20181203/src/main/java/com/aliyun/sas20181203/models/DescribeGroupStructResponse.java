// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupStructResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupStructResponseBody body;

    public static DescribeGroupStructResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupStructResponse self = new DescribeGroupStructResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupStructResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupStructResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupStructResponse setBody(DescribeGroupStructResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupStructResponseBody getBody() {
        return this.body;
    }

}
