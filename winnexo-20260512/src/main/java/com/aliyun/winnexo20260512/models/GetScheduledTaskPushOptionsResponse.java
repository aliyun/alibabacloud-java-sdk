// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskPushOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduledTaskPushOptionsResponseBody body;

    public static GetScheduledTaskPushOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskPushOptionsResponse self = new GetScheduledTaskPushOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskPushOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledTaskPushOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledTaskPushOptionsResponse setBody(GetScheduledTaskPushOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduledTaskPushOptionsResponseBody getBody() {
        return this.body;
    }

}
