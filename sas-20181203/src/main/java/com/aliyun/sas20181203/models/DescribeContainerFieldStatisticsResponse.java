// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerFieldStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeContainerFieldStatisticsResponseBody body;

    public static DescribeContainerFieldStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerFieldStatisticsResponse self = new DescribeContainerFieldStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerFieldStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerFieldStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerFieldStatisticsResponse setBody(DescribeContainerFieldStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerFieldStatisticsResponseBody getBody() {
        return this.body;
    }

}
