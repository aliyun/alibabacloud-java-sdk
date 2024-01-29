// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActiveOperationTaskResponseBody body;

    public static DescribeActiveOperationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTaskResponse self = new DescribeActiveOperationTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveOperationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActiveOperationTaskResponse setBody(DescribeActiveOperationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveOperationTaskResponseBody getBody() {
        return this.body;
    }

}
