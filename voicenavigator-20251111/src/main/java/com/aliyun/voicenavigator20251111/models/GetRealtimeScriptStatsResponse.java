// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetRealtimeScriptStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRealtimeScriptStatsResponseBody body;

    public static GetRealtimeScriptStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeScriptStatsResponse self = new GetRealtimeScriptStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetRealtimeScriptStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRealtimeScriptStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRealtimeScriptStatsResponse setBody(GetRealtimeScriptStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRealtimeScriptStatsResponseBody getBody() {
        return this.body;
    }

}
