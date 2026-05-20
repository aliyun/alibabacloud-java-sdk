// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSharedBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSharedBackupsResponseBody body;

    public static DescribeSharedBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSharedBackupsResponse self = new DescribeSharedBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSharedBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSharedBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSharedBackupsResponse setBody(DescribeSharedBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSharedBackupsResponseBody getBody() {
        return this.body;
    }

}
