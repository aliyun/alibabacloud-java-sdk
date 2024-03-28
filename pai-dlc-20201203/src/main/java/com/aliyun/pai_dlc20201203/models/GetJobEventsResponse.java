// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobEventsResponseBody body;

    public static GetJobEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobEventsResponse self = new GetJobEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetJobEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobEventsResponse setBody(GetJobEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobEventsResponseBody getBody() {
        return this.body;
    }

}
