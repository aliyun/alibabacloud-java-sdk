// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConversationDetailsResponseBody body;

    public static ListConversationDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConversationDetailsResponse self = new ListConversationDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListConversationDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConversationDetailsResponse setBody(ListConversationDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConversationDetailsResponseBody getBody() {
        return this.body;
    }

}
