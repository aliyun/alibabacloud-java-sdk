// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackPathEventStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttackPathEventStatisticsResponseBody body;

    public static GetAttackPathEventStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttackPathEventStatisticsResponse self = new GetAttackPathEventStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetAttackPathEventStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttackPathEventStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttackPathEventStatisticsResponse setBody(GetAttackPathEventStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttackPathEventStatisticsResponseBody getBody() {
        return this.body;
    }

}
