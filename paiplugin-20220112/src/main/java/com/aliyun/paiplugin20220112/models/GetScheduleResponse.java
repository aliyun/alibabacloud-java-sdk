// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetScheduleResponseBody body;

    public static GetScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleResponse self = new GetScheduleResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduleResponse setBody(GetScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduleResponseBody getBody() {
        return this.body;
    }

}
