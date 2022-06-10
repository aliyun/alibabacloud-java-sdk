// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEipMonitorDataResponseBody body;

    public static DescribeEipMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipMonitorDataResponse self = new DescribeEipMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEipMonitorDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEipMonitorDataResponse setBody(DescribeEipMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEipMonitorDataResponseBody getBody() {
        return this.body;
    }

}
