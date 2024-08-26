// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNisInspectionTaskResponseBody body;

    public static DescribeNisInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionTaskResponse self = new DescribeNisInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNisInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNisInspectionTaskResponse setBody(DescribeNisInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNisInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
