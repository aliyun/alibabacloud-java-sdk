// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeSessionLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSessionLogsResponseBody body;

    public static DescribeSessionLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSessionLogsResponse self = new DescribeSessionLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSessionLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSessionLogsResponse setBody(DescribeSessionLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSessionLogsResponseBody getBody() {
        return this.body;
    }

}
