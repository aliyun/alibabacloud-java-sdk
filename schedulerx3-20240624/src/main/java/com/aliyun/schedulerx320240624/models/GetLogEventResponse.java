// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetLogEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogEventResponseBody body;

    public static GetLogEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogEventResponse self = new GetLogEventResponse();
        return TeaModel.build(map, self);
    }

    public GetLogEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogEventResponse setBody(GetLogEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogEventResponseBody getBody() {
        return this.body;
    }

}
