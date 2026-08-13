// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDingtalkMeetingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalDingtalkMeetingResponseBody body;

    public static CreatePersonalDingtalkMeetingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDingtalkMeetingResponse self = new CreatePersonalDingtalkMeetingResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDingtalkMeetingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalDingtalkMeetingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalDingtalkMeetingResponse setBody(CreatePersonalDingtalkMeetingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalDingtalkMeetingResponseBody getBody() {
        return this.body;
    }

}
