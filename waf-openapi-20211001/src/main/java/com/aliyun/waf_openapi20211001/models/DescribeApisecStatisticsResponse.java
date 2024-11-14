// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecStatisticsResponseBody body;

    public static DescribeApisecStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecStatisticsResponse self = new DescribeApisecStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecStatisticsResponse setBody(DescribeApisecStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecStatisticsResponseBody getBody() {
        return this.body;
    }

}
