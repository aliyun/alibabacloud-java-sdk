// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAliDingGroupMessagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAliDingGroupMessagesResponseBody body;

    public static ListAliDingGroupMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAliDingGroupMessagesResponse self = new ListAliDingGroupMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAliDingGroupMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAliDingGroupMessagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAliDingGroupMessagesResponse setBody(ListAliDingGroupMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAliDingGroupMessagesResponseBody getBody() {
        return this.body;
    }

}
