// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMonitorDataResponseBody body;

    public static DescribeMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorDataResponse self = new DescribeMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorDataResponse setBody(DescribeMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorDataResponseBody getBody() {
        return this.body;
    }

}
