// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetConversationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConversationsResponseBody body;

    public static GetConversationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConversationsResponse self = new GetConversationsResponse();
        return TeaModel.build(map, self);
    }

    public GetConversationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConversationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConversationsResponse setBody(GetConversationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConversationsResponseBody getBody() {
        return this.body;
    }

}
