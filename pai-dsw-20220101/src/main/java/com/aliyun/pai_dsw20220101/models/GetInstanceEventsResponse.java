// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceEventsResponseBody body;

    public static GetInstanceEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceEventsResponse self = new GetInstanceEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceEventsResponse setBody(GetInstanceEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceEventsResponseBody getBody() {
        return this.body;
    }

}
