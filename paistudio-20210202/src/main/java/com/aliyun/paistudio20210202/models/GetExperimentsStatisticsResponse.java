// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentsStatisticsResponseBody body;

    public static GetExperimentsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentsStatisticsResponse self = new GetExperimentsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentsStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentsStatisticsResponse setBody(GetExperimentsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentsStatisticsResponseBody getBody() {
        return this.body;
    }

}
