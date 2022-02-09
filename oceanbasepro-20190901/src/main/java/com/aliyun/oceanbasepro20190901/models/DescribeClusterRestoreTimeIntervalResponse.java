// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeClusterRestoreTimeIntervalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterRestoreTimeIntervalResponseBody body;

    public static DescribeClusterRestoreTimeIntervalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterRestoreTimeIntervalResponse self = new DescribeClusterRestoreTimeIntervalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterRestoreTimeIntervalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterRestoreTimeIntervalResponse setBody(DescribeClusterRestoreTimeIntervalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterRestoreTimeIntervalResponseBody getBody() {
        return this.body;
    }

}
