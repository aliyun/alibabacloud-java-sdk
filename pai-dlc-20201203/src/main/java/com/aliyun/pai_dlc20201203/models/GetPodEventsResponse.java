// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPodEventsResponseBody body;

    public static GetPodEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPodEventsResponse self = new GetPodEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetPodEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPodEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPodEventsResponse setBody(GetPodEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPodEventsResponseBody getBody() {
        return this.body;
    }

}
