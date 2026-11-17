// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ConvertDirectConversationToWorkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertDirectConversationToWorkResponseBody body;

    public static ConvertDirectConversationToWorkResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertDirectConversationToWorkResponse self = new ConvertDirectConversationToWorkResponse();
        return TeaModel.build(map, self);
    }

    public ConvertDirectConversationToWorkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertDirectConversationToWorkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertDirectConversationToWorkResponse setBody(ConvertDirectConversationToWorkResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertDirectConversationToWorkResponseBody getBody() {
        return this.body;
    }

}
