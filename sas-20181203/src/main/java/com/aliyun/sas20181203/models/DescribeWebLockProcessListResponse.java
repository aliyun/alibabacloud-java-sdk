// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockProcessListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebLockProcessListResponseBody body;

    public static DescribeWebLockProcessListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockProcessListResponse self = new DescribeWebLockProcessListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockProcessListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockProcessListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebLockProcessListResponse setBody(DescribeWebLockProcessListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockProcessListResponseBody getBody() {
        return this.body;
    }

}
