// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeArchiveTableListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeArchiveTableListResponseBody body;

    public static DescribeArchiveTableListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeArchiveTableListResponse self = new DescribeArchiveTableListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeArchiveTableListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeArchiveTableListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeArchiveTableListResponse setBody(DescribeArchiveTableListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeArchiveTableListResponseBody getBody() {
        return this.body;
    }

}
