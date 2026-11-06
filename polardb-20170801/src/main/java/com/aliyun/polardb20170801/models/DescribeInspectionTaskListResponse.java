// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInspectionTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInspectionTaskListResponseBody body;

    public static DescribeInspectionTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTaskListResponse self = new DescribeInspectionTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInspectionTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInspectionTaskListResponse setBody(DescribeInspectionTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInspectionTaskListResponseBody getBody() {
        return this.body;
    }

}
