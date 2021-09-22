// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetExperimentsStatisticsResponse setBody(GetExperimentsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentsStatisticsResponseBody getBody() {
        return this.body;
    }

}
