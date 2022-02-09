// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsSyncMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOmsSyncMonitorResponseBody body;

    public static DescribeOmsSyncMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsSyncMonitorResponse self = new DescribeOmsSyncMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsSyncMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsSyncMonitorResponse setBody(DescribeOmsSyncMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsSyncMonitorResponseBody getBody() {
        return this.body;
    }

}
