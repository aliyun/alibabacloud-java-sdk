// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTotalStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTotalStatisticsResponseBody body;

    public static DescribeTotalStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTotalStatisticsResponse self = new DescribeTotalStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTotalStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTotalStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTotalStatisticsResponse setBody(DescribeTotalStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTotalStatisticsResponseBody getBody() {
        return this.body;
    }

}
