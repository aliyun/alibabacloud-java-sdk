// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBLogFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBLogFilesResponseBody body;

    public static DescribeDBLogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBLogFilesResponse self = new DescribeDBLogFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBLogFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBLogFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBLogFilesResponse setBody(DescribeDBLogFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBLogFilesResponseBody getBody() {
        return this.body;
    }

}
