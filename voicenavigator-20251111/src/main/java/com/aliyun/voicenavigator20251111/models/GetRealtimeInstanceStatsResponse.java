// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetRealtimeInstanceStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRealtimeInstanceStatsResponseBody body;

    public static GetRealtimeInstanceStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeInstanceStatsResponse self = new GetRealtimeInstanceStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetRealtimeInstanceStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealtimeInstanceStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealtimeInstanceStatsResponse setBody(GetRealtimeInstanceStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeInstanceStatsResponseBody getBody() {
        return this.body;
    }

}
