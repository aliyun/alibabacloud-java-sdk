// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeChangeLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChangeLogsResponseBody body;

    public static DescribeChangeLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeLogsResponse self = new DescribeChangeLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChangeLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChangeLogsResponse setBody(DescribeChangeLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChangeLogsResponseBody getBody() {
        return this.body;
    }

}
