// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConversationsResponseBody body;

    public static ListConversationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConversationsResponse self = new ListConversationsResponse();
        return TeaModel.build(map, self);
    }

    public ListConversationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConversationsResponse setBody(ListConversationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConversationsResponseBody getBody() {
        return this.body;
    }

}
