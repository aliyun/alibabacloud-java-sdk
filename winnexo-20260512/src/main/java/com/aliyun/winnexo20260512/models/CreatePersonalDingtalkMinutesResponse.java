// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDingtalkMinutesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalDingtalkMinutesResponseBody body;

    public static CreatePersonalDingtalkMinutesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDingtalkMinutesResponse self = new CreatePersonalDingtalkMinutesResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDingtalkMinutesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalDingtalkMinutesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalDingtalkMinutesResponse setBody(CreatePersonalDingtalkMinutesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalDingtalkMinutesResponseBody getBody() {
        return this.body;
    }

}
