// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchResourceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenSearchResourceUsageResponseBody body;

    public static DescribeOpenSearchResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchResourceUsageResponse self = new DescribeOpenSearchResourceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchResourceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenSearchResourceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenSearchResourceUsageResponse setBody(DescribeOpenSearchResourceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenSearchResourceUsageResponseBody getBody() {
        return this.body;
    }

}
