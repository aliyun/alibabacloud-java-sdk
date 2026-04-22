// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListRealtimeInstanceStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRealtimeInstanceStatsResponseBody body;

    public static ListRealtimeInstanceStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeInstanceStatsResponse self = new ListRealtimeInstanceStatsResponse();
        return TeaModel.build(map, self);
    }

    public ListRealtimeInstanceStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRealtimeInstanceStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRealtimeInstanceStatsResponse setBody(ListRealtimeInstanceStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRealtimeInstanceStatsResponseBody getBody() {
        return this.body;
    }

}
