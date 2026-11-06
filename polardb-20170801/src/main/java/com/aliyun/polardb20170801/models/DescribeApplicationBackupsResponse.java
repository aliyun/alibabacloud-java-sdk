// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApplicationBackupsResponseBody body;

    public static DescribeApplicationBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationBackupsResponse self = new DescribeApplicationBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApplicationBackupsResponse setBody(DescribeApplicationBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationBackupsResponseBody getBody() {
        return this.body;
    }

}
