// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebLockStatusResponseBody body;

    public static DescribeWebLockStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockStatusResponse self = new DescribeWebLockStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebLockStatusResponse setBody(DescribeWebLockStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockStatusResponseBody getBody() {
        return this.body;
    }

}
