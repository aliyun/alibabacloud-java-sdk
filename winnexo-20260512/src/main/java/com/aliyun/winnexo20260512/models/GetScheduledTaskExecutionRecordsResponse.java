// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskExecutionRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduledTaskExecutionRecordsResponseBody body;

    public static GetScheduledTaskExecutionRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskExecutionRecordsResponse self = new GetScheduledTaskExecutionRecordsResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskExecutionRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledTaskExecutionRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledTaskExecutionRecordsResponse setBody(GetScheduledTaskExecutionRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduledTaskExecutionRecordsResponseBody getBody() {
        return this.body;
    }

}
