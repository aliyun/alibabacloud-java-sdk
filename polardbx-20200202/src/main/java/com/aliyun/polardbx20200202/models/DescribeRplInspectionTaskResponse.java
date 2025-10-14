// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeRplInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRplInspectionTaskResponseBody body;

    public static DescribeRplInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRplInspectionTaskResponse self = new DescribeRplInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRplInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRplInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRplInspectionTaskResponse setBody(DescribeRplInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRplInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
