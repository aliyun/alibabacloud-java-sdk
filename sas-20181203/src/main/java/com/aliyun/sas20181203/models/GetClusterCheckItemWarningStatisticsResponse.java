// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClusterCheckItemWarningStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterCheckItemWarningStatisticsResponseBody body;

    public static GetClusterCheckItemWarningStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterCheckItemWarningStatisticsResponse self = new GetClusterCheckItemWarningStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterCheckItemWarningStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterCheckItemWarningStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterCheckItemWarningStatisticsResponse setBody(GetClusterCheckItemWarningStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterCheckItemWarningStatisticsResponseBody getBody() {
        return this.body;
    }

}
