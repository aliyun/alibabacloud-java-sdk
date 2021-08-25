// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstancesStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstancesStatisticsResponseBody body;

    public static GetInstancesStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesStatisticsResponse self = new GetInstancesStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetInstancesStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstancesStatisticsResponse setBody(GetInstancesStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstancesStatisticsResponseBody getBody() {
        return this.body;
    }

}
