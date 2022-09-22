// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20220930.models;

import com.aliyun.tea.*;

public class CreateMeetingTransResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMeetingTransResponseBody body;

    public static CreateMeetingTransResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingTransResponse self = new CreateMeetingTransResponse();
        return TeaModel.build(map, self);
    }

    public CreateMeetingTransResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMeetingTransResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMeetingTransResponse setBody(CreateMeetingTransResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMeetingTransResponseBody getBody() {
        return this.body;
    }

}
