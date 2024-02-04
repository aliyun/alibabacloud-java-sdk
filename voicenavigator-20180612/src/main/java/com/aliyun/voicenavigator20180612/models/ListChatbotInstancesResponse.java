// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListChatbotInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListChatbotInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatbotInstancesResponse setBody(ListChatbotInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatbotInstancesResponseBody getBody() {
        return this.body;
    }

}
