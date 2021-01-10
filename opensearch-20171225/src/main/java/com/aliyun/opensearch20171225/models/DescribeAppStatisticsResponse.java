// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppStatisticsResponseBody body;

    public static DescribeAppStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppStatisticsResponse self = new DescribeAppStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppStatisticsResponse setBody(DescribeAppStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppStatisticsResponseBody getBody() {
        return this.body;
    }

}
