// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventsResponseBody body;

    public static GetEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventsResponse self = new GetEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventsResponse setBody(GetEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventsResponseBody getBody() {
        return this.body;
    }

}
