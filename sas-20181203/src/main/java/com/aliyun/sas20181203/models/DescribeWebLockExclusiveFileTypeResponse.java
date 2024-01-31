// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockExclusiveFileTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebLockExclusiveFileTypeResponseBody body;

    public static DescribeWebLockExclusiveFileTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockExclusiveFileTypeResponse self = new DescribeWebLockExclusiveFileTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockExclusiveFileTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockExclusiveFileTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebLockExclusiveFileTypeResponse setBody(DescribeWebLockExclusiveFileTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockExclusiveFileTypeResponseBody getBody() {
        return this.body;
    }

}
