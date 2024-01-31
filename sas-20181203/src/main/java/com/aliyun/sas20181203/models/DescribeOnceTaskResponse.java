// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOnceTaskResponseBody body;

    public static DescribeOnceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnceTaskResponse self = new DescribeOnceTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOnceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOnceTaskResponse setBody(DescribeOnceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOnceTaskResponseBody getBody() {
        return this.body;
    }

}
