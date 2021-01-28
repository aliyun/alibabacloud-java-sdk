// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryMonitorValuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeHistoryMonitorValuesResponseBody body;

    public static DescribeHistoryMonitorValuesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryMonitorValuesResponse self = new DescribeHistoryMonitorValuesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryMonitorValuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHistoryMonitorValuesResponse setBody(DescribeHistoryMonitorValuesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHistoryMonitorValuesResponseBody getBody() {
        return this.body;
    }

}
