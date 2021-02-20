// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteEventSubscribeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEventSubscribeResponseBody body;

    public static DeleteEventSubscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventSubscribeResponse self = new DeleteEventSubscribeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventSubscribeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventSubscribeResponse setBody(DeleteEventSubscribeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventSubscribeResponseBody getBody() {
        return this.body;
    }

}
