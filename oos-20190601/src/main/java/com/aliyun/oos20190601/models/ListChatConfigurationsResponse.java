// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListChatConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChatConfigurationsResponseBody body;

    public static ListChatConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChatConfigurationsResponse self = new ListChatConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListChatConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChatConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChatConfigurationsResponse setBody(ListChatConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChatConfigurationsResponseBody getBody() {
        return this.body;
    }

}
