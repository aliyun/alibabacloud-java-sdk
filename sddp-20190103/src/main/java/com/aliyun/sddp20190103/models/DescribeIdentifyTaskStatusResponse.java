// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeIdentifyTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIdentifyTaskStatusResponseBody body;

    public static DescribeIdentifyTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdentifyTaskStatusResponse self = new DescribeIdentifyTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIdentifyTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIdentifyTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIdentifyTaskStatusResponse setBody(DescribeIdentifyTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIdentifyTaskStatusResponseBody getBody() {
        return this.body;
    }

}
