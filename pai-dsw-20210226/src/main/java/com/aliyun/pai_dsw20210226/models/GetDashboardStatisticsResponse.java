// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetDashboardStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDashboardStatisticsResponseBody body;

    public static GetDashboardStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardStatisticsResponse self = new GetDashboardStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetDashboardStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDashboardStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDashboardStatisticsResponse setBody(GetDashboardStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDashboardStatisticsResponseBody getBody() {
        return this.body;
    }

}
