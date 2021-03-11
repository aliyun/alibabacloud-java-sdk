// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecordsResponseBody body;

    public static DescribeRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordsResponse self = new DescribeRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordsResponse setBody(DescribeRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordsResponseBody getBody() {
        return this.body;
    }

}
