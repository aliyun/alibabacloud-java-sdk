// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCheckWarningsResponseBody body;

    public static DescribeCheckWarningsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningsResponse self = new DescribeCheckWarningsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckWarningsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCheckWarningsResponse setBody(DescribeCheckWarningsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckWarningsResponseBody getBody() {
        return this.body;
    }

}
