// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMessagesResponseBody body;

    public static ListMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesResponse self = new ListMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessagesResponse setBody(ListMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessagesResponseBody getBody() {
        return this.body;
    }

}
