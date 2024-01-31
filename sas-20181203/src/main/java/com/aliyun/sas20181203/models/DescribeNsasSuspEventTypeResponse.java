// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNsasSuspEventTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNsasSuspEventTypeResponseBody body;

    public static DescribeNsasSuspEventTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNsasSuspEventTypeResponse self = new DescribeNsasSuspEventTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNsasSuspEventTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNsasSuspEventTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNsasSuspEventTypeResponse setBody(DescribeNsasSuspEventTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNsasSuspEventTypeResponseBody getBody() {
        return this.body;
    }

}
