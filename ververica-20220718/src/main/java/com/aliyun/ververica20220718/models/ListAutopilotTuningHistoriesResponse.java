// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListAutopilotTuningHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutopilotTuningHistoriesResponseBody body;

    public static ListAutopilotTuningHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutopilotTuningHistoriesResponse self = new ListAutopilotTuningHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutopilotTuningHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutopilotTuningHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutopilotTuningHistoriesResponse setBody(ListAutopilotTuningHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutopilotTuningHistoriesResponseBody getBody() {
        return this.body;
    }

}
