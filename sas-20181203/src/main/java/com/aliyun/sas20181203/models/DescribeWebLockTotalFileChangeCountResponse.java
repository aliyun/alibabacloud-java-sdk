// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockTotalFileChangeCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebLockTotalFileChangeCountResponseBody body;

    public static DescribeWebLockTotalFileChangeCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockTotalFileChangeCountResponse self = new DescribeWebLockTotalFileChangeCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockTotalFileChangeCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockTotalFileChangeCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebLockTotalFileChangeCountResponse setBody(DescribeWebLockTotalFileChangeCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockTotalFileChangeCountResponseBody getBody() {
        return this.body;
    }

}
