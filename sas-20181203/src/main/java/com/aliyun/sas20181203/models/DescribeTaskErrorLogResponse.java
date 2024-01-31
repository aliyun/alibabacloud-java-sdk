// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTaskErrorLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTaskErrorLogResponseBody body;

    public static DescribeTaskErrorLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskErrorLogResponse self = new DescribeTaskErrorLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskErrorLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskErrorLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTaskErrorLogResponse setBody(DescribeTaskErrorLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskErrorLogResponseBody getBody() {
        return this.body;
    }

}
