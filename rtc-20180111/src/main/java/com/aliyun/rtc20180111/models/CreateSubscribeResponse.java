// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubscribeResponseBody body;

    public static CreateSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribeResponse self = new CreateSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubscribeResponse setBody(CreateSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubscribeResponseBody getBody() {
        return this.body;
    }

}
