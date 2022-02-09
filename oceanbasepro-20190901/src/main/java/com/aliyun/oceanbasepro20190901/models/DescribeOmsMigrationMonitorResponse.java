// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsMigrationMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOmsMigrationMonitorResponseBody body;

    public static DescribeOmsMigrationMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsMigrationMonitorResponse self = new DescribeOmsMigrationMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsMigrationMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsMigrationMonitorResponse setBody(DescribeOmsMigrationMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsMigrationMonitorResponseBody getBody() {
        return this.body;
    }

}
