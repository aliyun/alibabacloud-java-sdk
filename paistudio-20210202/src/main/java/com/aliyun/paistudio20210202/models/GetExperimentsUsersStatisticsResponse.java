// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsUsersStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetExperimentsUsersStatisticsResponse setBody(GetExperimentsUsersStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentsUsersStatisticsResponseBody getBody() {
        return this.body;
    }

}
