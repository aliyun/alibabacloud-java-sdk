// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOfflineMachinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOfflineMachinesResponseBody body;

    public static DescribeOfflineMachinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfflineMachinesResponse self = new DescribeOfflineMachinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOfflineMachinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOfflineMachinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOfflineMachinesResponse setBody(DescribeOfflineMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOfflineMachinesResponseBody getBody() {
        return this.body;
    }

}
