// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionPrecheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUpgradeMajorVersionPrecheckTaskResponseBody body;

    public static DescribeUpgradeMajorVersionPrecheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeMajorVersionPrecheckTaskResponse self = new DescribeUpgradeMajorVersionPrecheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeMajorVersionPrecheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUpgradeMajorVersionPrecheckTaskResponse setBody(DescribeUpgradeMajorVersionPrecheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpgradeMajorVersionPrecheckTaskResponseBody getBody() {
        return this.body;
    }

}
