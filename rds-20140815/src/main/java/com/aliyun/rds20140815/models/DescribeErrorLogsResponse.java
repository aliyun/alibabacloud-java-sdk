// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeErrorLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeErrorLogsResponseBody body;

    public static DescribeErrorLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogsResponse self = new DescribeErrorLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeErrorLogsResponse setBody(DescribeErrorLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeErrorLogsResponseBody getBody() {
        return this.body;
    }

}
