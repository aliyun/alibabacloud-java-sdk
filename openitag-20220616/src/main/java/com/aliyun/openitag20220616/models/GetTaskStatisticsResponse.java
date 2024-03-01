// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskStatisticsResponseBody body;

    public static GetTaskStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatisticsResponse self = new GetTaskStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskStatisticsResponse setBody(GetTaskStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskStatisticsResponseBody getBody() {
        return this.body;
    }

}
