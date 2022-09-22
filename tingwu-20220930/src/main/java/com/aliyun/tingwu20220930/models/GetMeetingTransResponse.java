// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class GetMeetingTransResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMeetingTransResponseBody body;

    public static GetMeetingTransResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMeetingTransResponse self = new GetMeetingTransResponse();
        return TeaModel.build(map, self);
    }

    public GetMeetingTransResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMeetingTransResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMeetingTransResponse setBody(GetMeetingTransResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMeetingTransResponseBody getBody() {
        return this.body;
    }

}
