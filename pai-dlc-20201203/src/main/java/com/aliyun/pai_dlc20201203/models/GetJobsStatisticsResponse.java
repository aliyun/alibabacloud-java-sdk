// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobsStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobsStatisticsResponseBody body;

    public static GetJobsStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobsStatisticsResponse self = new GetJobsStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetJobsStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobsStatisticsResponse setBody(GetJobsStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobsStatisticsResponseBody getBody() {
        return this.body;
    }

}
