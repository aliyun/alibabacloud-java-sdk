// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRecordTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecordTasksResponseBody body;

    public static DescribeRecordTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordTasksResponse self = new DescribeRecordTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecordTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecordTasksResponse setBody(DescribeRecordTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecordTasksResponseBody getBody() {
        return this.body;
    }

}
