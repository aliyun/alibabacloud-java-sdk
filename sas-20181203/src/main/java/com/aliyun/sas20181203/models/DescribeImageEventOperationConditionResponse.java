// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageEventOperationConditionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageEventOperationConditionResponseBody body;

    public static DescribeImageEventOperationConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageEventOperationConditionResponse self = new DescribeImageEventOperationConditionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageEventOperationConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageEventOperationConditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageEventOperationConditionResponse setBody(DescribeImageEventOperationConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageEventOperationConditionResponseBody getBody() {
        return this.body;
    }

}
