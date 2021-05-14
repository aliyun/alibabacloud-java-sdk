// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageStatisticsResponseBody body;

    public static DescribeImageStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageStatisticsResponse self = new DescribeImageStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageStatisticsResponse setBody(DescribeImageStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageStatisticsResponseBody getBody() {
        return this.body;
    }

}
