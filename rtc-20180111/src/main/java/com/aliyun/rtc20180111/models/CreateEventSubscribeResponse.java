// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateEventSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEventSubscribeResponseBody body;

    public static CreateEventSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSubscribeResponse self = new CreateEventSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public CreateEventSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEventSubscribeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEventSubscribeResponse setBody(CreateEventSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEventSubscribeResponseBody getBody() {
        return this.body;
    }

}
