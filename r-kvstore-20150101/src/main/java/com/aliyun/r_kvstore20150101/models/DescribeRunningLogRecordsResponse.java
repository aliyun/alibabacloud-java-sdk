// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeRunningLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRunningLogRecordsResponseBody body;

    public static DescribeRunningLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningLogRecordsResponse self = new DescribeRunningLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRunningLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRunningLogRecordsResponse setBody(DescribeRunningLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRunningLogRecordsResponseBody getBody() {
        return this.body;
    }

}
