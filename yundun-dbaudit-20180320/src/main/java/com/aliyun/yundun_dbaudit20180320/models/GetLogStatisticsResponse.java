// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogStatisticsResponseBody body;

    public static GetLogStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogStatisticsResponse self = new GetLogStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetLogStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogStatisticsResponse setBody(GetLogStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogStatisticsResponseBody getBody() {
        return this.body;
    }

}
