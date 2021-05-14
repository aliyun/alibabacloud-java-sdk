// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFieldStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFieldStatisticsResponseBody body;

    public static DescribeFieldStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldStatisticsResponse self = new DescribeFieldStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFieldStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFieldStatisticsResponse setBody(DescribeFieldStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFieldStatisticsResponseBody getBody() {
        return this.body;
    }

}
