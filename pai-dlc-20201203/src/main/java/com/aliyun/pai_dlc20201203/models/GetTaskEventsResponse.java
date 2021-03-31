// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTaskEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskEventsResponseBody body;

    public static GetTaskEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskEventsResponse self = new GetTaskEventsResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskEventsResponse setBody(GetTaskEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskEventsResponseBody getBody() {
        return this.body;
    }

}
