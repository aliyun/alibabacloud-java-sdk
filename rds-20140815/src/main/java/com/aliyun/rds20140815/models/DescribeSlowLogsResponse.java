// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSlowLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlowLogsResponseBody body;

    public static DescribeSlowLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogsResponse self = new DescribeSlowLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlowLogsResponse setBody(DescribeSlowLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlowLogsResponseBody getBody() {
        return this.body;
    }

}
