// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupStatisticsByTodayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupStatisticsByTodayResponseBody body;

    public static DescribeGroupStatisticsByTodayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupStatisticsByTodayResponse self = new DescribeGroupStatisticsByTodayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupStatisticsByTodayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupStatisticsByTodayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupStatisticsByTodayResponse setBody(DescribeGroupStatisticsByTodayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupStatisticsByTodayResponseBody getBody() {
        return this.body;
    }

}
