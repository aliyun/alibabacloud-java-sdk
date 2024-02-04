// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDetachedBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDetachedBackupsResponseBody body;

    public static DescribeDetachedBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDetachedBackupsResponse self = new DescribeDetachedBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDetachedBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDetachedBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDetachedBackupsResponse setBody(DescribeDetachedBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDetachedBackupsResponseBody getBody() {
        return this.body;
    }

}
