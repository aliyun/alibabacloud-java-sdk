// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeUserOnlineClientStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserOnlineClientStatisticsResponseBody body;

    public static DescribeUserOnlineClientStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserOnlineClientStatisticsResponse self = new DescribeUserOnlineClientStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserOnlineClientStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserOnlineClientStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserOnlineClientStatisticsResponse setBody(DescribeUserOnlineClientStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserOnlineClientStatisticsResponseBody getBody() {
        return this.body;
    }

}
