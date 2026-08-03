// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInspectionTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionTasksResponseBody body;

    public static DescribeInspectionTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTasksResponse self = new DescribeInspectionTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionTasksResponse setBody(DescribeInspectionTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionTasksResponseBody getBody() {
        return this.body;
    }

}
