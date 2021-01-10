// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListChatbotInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListChatbotInstancesResponseBody body;

    public static ListChatbotInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatbotInstancesResponse self = new ListChatbotInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListChatbotInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatbotInstancesResponse setBody(ListChatbotInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatbotInstancesResponseBody getBody() {
        return this.body;
    }

}
