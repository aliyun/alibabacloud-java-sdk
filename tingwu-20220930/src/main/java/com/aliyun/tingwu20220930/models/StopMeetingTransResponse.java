// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class StopMeetingTransResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopMeetingTransResponseBody body;

    public static StopMeetingTransResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMeetingTransResponse self = new StopMeetingTransResponse();
        return TeaModel.build(map, self);
    }

    public StopMeetingTransResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMeetingTransResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopMeetingTransResponse setBody(StopMeetingTransResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMeetingTransResponseBody getBody() {
        return this.body;
    }

}
