// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVulStatisticsResponseBody body;

    public static GetVulStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVulStatisticsResponse self = new GetVulStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetVulStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVulStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVulStatisticsResponse setBody(GetVulStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVulStatisticsResponseBody getBody() {
        return this.body;
    }

}
