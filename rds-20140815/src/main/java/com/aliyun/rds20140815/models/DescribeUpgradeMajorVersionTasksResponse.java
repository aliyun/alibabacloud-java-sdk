// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUpgradeMajorVersionTasksResponseBody body;

    public static DescribeUpgradeMajorVersionTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeMajorVersionTasksResponse self = new DescribeUpgradeMajorVersionTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeMajorVersionTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUpgradeMajorVersionTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUpgradeMajorVersionTasksResponse setBody(DescribeUpgradeMajorVersionTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUpgradeMajorVersionTasksResponseBody getBody() {
        return this.body;
    }

}
