// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockBindListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebLockBindListResponseBody body;

    public static DescribeWebLockBindListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockBindListResponse self = new DescribeWebLockBindListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockBindListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockBindListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebLockBindListResponse setBody(DescribeWebLockBindListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockBindListResponseBody getBody() {
        return this.body;
    }

}
