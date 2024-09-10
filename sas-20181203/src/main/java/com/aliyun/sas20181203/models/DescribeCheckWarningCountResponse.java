// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCheckWarningCountResponseBody body;

    public static DescribeCheckWarningCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningCountResponse self = new DescribeCheckWarningCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckWarningCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCheckWarningCountResponse setBody(DescribeCheckWarningCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckWarningCountResponseBody getBody() {
        return this.body;
    }

}
