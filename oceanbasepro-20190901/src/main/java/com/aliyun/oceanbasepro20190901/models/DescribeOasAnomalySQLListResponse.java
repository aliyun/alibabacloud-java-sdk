// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOasAnomalySQLListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOasAnomalySQLListResponseBody body;

    public static DescribeOasAnomalySQLListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOasAnomalySQLListResponse self = new DescribeOasAnomalySQLListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOasAnomalySQLListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOasAnomalySQLListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOasAnomalySQLListResponse setBody(DescribeOasAnomalySQLListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOasAnomalySQLListResponseBody getBody() {
        return this.body;
    }

}
