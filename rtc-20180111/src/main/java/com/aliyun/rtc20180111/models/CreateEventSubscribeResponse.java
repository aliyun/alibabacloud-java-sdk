// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateEventSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateEventSubscribeResponse setBody(CreateEventSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEventSubscribeResponseBody getBody() {
        return this.body;
    }

}
