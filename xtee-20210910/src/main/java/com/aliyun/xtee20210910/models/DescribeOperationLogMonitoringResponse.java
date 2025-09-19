// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperationLogMonitoringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOperationLogMonitoringResponseBody body;

    public static DescribeOperationLogMonitoringResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperationLogMonitoringResponse self = new DescribeOperationLogMonitoringResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOperationLogMonitoringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOperationLogMonitoringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOperationLogMonitoringResponse setBody(DescribeOperationLogMonitoringResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOperationLogMonitoringResponseBody getBody() {
        return this.body;
    }

}
