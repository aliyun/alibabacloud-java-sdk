// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSuspiciousStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSuspiciousStatisticsResponseBody body;

    public static GetSuspiciousStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSuspiciousStatisticsResponse self = new GetSuspiciousStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetSuspiciousStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSuspiciousStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSuspiciousStatisticsResponse setBody(GetSuspiciousStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSuspiciousStatisticsResponseBody getBody() {
        return this.body;
    }

}
