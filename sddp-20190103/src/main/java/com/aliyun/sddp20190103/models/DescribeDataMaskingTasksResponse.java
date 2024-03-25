// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataMaskingTasksResponseBody body;

    public static DescribeDataMaskingTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingTasksResponse self = new DescribeDataMaskingTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataMaskingTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataMaskingTasksResponse setBody(DescribeDataMaskingTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataMaskingTasksResponseBody getBody() {
        return this.body;
    }

}
