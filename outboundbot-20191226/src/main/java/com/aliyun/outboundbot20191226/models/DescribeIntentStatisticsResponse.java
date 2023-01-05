// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeIntentStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIntentStatisticsResponseBody body;

    public static DescribeIntentStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentStatisticsResponse self = new DescribeIntentStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIntentStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIntentStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIntentStatisticsResponse setBody(DescribeIntentStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIntentStatisticsResponseBody getBody() {
        return this.body;
    }

}
