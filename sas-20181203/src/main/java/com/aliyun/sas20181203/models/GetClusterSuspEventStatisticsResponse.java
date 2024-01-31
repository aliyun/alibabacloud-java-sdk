// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterSuspEventStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterSuspEventStatisticsResponseBody body;

    public static GetClusterSuspEventStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterSuspEventStatisticsResponse self = new GetClusterSuspEventStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterSuspEventStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterSuspEventStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterSuspEventStatisticsResponse setBody(GetClusterSuspEventStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterSuspEventStatisticsResponseBody getBody() {
        return this.body;
    }

}
