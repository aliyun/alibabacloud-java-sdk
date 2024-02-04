// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAnomalySQLListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAnomalySQLListResponseBody body;

    public static DescribeAnomalySQLListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnomalySQLListResponse self = new DescribeAnomalySQLListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAnomalySQLListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAnomalySQLListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAnomalySQLListResponse setBody(DescribeAnomalySQLListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAnomalySQLListResponseBody getBody() {
        return this.body;
    }

}
