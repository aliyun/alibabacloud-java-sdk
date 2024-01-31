// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockInclusiveFileTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebLockInclusiveFileTypeResponseBody body;

    public static DescribeWebLockInclusiveFileTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockInclusiveFileTypeResponse self = new DescribeWebLockInclusiveFileTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockInclusiveFileTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockInclusiveFileTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebLockInclusiveFileTypeResponse setBody(DescribeWebLockInclusiveFileTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockInclusiveFileTypeResponseBody getBody() {
        return this.body;
    }

}
