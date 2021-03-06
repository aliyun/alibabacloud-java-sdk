// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudProductFieldStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCloudProductFieldStatisticsResponseBody body;

    public static DescribeCloudProductFieldStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudProductFieldStatisticsResponse self = new DescribeCloudProductFieldStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudProductFieldStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudProductFieldStatisticsResponse setBody(DescribeCloudProductFieldStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudProductFieldStatisticsResponseBody getBody() {
        return this.body;
    }

}
