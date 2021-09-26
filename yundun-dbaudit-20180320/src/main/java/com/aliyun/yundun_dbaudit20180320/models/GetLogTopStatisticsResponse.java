// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogTopStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogTopStatisticsResponseBody body;

    public static GetLogTopStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogTopStatisticsResponse self = new GetLogTopStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetLogTopStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogTopStatisticsResponse setBody(GetLogTopStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogTopStatisticsResponseBody getBody() {
        return this.body;
    }

}
