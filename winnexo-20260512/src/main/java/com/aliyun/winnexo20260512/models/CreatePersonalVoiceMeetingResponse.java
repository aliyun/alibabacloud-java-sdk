// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalVoiceMeetingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalVoiceMeetingResponseBody body;

    public static CreatePersonalVoiceMeetingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalVoiceMeetingResponse self = new CreatePersonalVoiceMeetingResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalVoiceMeetingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalVoiceMeetingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalVoiceMeetingResponse setBody(CreatePersonalVoiceMeetingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalVoiceMeetingResponseBody getBody() {
        return this.body;
    }

}
