// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsUsersStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentsUsersStatisticsResponseBody body;

    public static GetExperimentsUsersStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentsUsersStatisticsResponse self = new GetExperimentsUsersStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentsUsersStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentsUsersStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentsUsersStatisticsResponse setBody(GetExperimentsUsersStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentsUsersStatisticsResponseBody getBody() {
        return this.body;
    }

}
